package com.message.test.entity;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.JoinEntity;
import org.greenrobot.greendao.annotation.ToMany;

import java.util.List;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.DaoException;

/**
 * Created by shengjunhao on 2016/11/24.
 */

@Entity
public class WebSite {

    @Id
    private String id;

    private String webName;

    private long creatTime;


    @ToMany
    @JoinEntity(entity = JoinImageToWeb.class, sourceProperty = "webId", targetProperty = "imageId")
    private List<Image> imageList;

    /** Used to resolve relations */
    @Generated(hash = 2040040024)
    private transient DaoSession daoSession;

    /** Used for active entity operations. */
    @Generated(hash = 1516408505)
    private transient WebSiteDao myDao;


    @Generated(hash = 860299767)
    public WebSite(String id, String webName, long creatTime) {
        this.id = id;
        this.webName = webName;
        this.creatTime = creatTime;
    }


    @Generated(hash = 121794805)
    public WebSite() {
    }


    public String getId() {
        return this.id;
    }


    public void setId(String id) {
        this.id = id;
    }


    public String getWebName() {
        return this.webName;
    }


    public void setWebName(String webName) {
        this.webName = webName;
    }


    public long getCreatTime() {
        return this.creatTime;
    }


    public void setCreatTime(long creatTime) {
        this.creatTime = creatTime;
    }


    /**
     * To-many relationship, resolved on first access (and after reset).
     * Changes to to-many relations are not persisted, make changes to the target entity.
     */
    @Generated(hash = 965690353)
    public List<Image> getImageList() {
        if (imageList == null) {
            final DaoSession daoSession = this.daoSession;
            if (daoSession == null) {
                throw new DaoException("Entity is detached from DAO context");
            }
            ImageDao targetDao = daoSession.getImageDao();
            List<Image> imageListNew = targetDao._queryWebSite_ImageList(id);
            synchronized (this) {
                if (imageList == null) {
                    imageList = imageListNew;
                }
            }
        }
        return imageList;
    }


    /** Resets a to-many relationship, making the next get call to query for a fresh result. */
    @Generated(hash = 15234777)
    public synchronized void resetImageList() {
        imageList = null;
    }


    /**
     * Convenient call for {@link org.greenrobot.greendao.AbstractDao#delete(Object)}.
     * Entity must attached to an entity context.
     */
    @Generated(hash = 128553479)
    public void delete() {
        if (myDao == null) {
            throw new DaoException("Entity is detached from DAO context");
        }
        myDao.delete(this);
    }


    /**
     * Convenient call for {@link org.greenrobot.greendao.AbstractDao#refresh(Object)}.
     * Entity must attached to an entity context.
     */
    @Generated(hash = 1942392019)
    public void refresh() {
        if (myDao == null) {
            throw new DaoException("Entity is detached from DAO context");
        }
        myDao.refresh(this);
    }


    /**
     * Convenient call for {@link org.greenrobot.greendao.AbstractDao#update(Object)}.
     * Entity must attached to an entity context.
     */
    @Generated(hash = 713229351)
    public void update() {
        if (myDao == null) {
            throw new DaoException("Entity is detached from DAO context");
        }
        myDao.update(this);
    }


    /** called by internal mechanisms, do not call yourself. */
    @Generated(hash = 1677143822)
    public void __setDaoSession(DaoSession daoSession) {
        this.daoSession = daoSession;
        myDao = daoSession != null ? daoSession.getWebSiteDao() : null;
    }
}
