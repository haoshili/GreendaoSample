package com.message.test.entity;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.ToOne;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.DaoException;

/**
 * Created by shengjunhao on 16/11/15.
 */

@Entity
public class Student {

    @Id
    private String id;

    private String stuName;
    private Long creatTime;

    private String classRoomId;

    @ToOne(joinProperty = "classRoomId")
    private ClassRoom classRoom;

    /** Used to resolve relations */
    @Generated(hash = 2040040024)
    private transient DaoSession daoSession;

    /** Used for active entity operations. */
    @Generated(hash = 1943931642)
    private transient StudentDao myDao;
    @Generated(hash = 713686536)
    public Student(String id, String stuName, Long creatTime, String classRoomId) {
        this.id = id;
        this.stuName = stuName;
        this.creatTime = creatTime;
        this.classRoomId = classRoomId;
    }
    @Generated(hash = 1556870573)
    public Student() {
    }
    public String getId() {
        return this.id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getStuName() {
        return this.stuName;
    }
    public void setStuName(String stuName) {
        this.stuName = stuName;
    }
    public Long getCreatTime() {
        return this.creatTime;
    }
    public void setCreatTime(Long creatTime) {
        this.creatTime = creatTime;
    }
    public String getClassRoomId() {
        return this.classRoomId;
    }
    public void setClassRoomId(String classRoomId) {
        this.classRoomId = classRoomId;
    }
    @Generated(hash = 1143999128)
    private transient String classRoom__resolvedKey;
    /** To-one relationship, resolved on first access. */
    @Generated(hash = 1932420280)
    public ClassRoom getClassRoom() {
        String __key = this.classRoomId;
        if (classRoom__resolvedKey == null || classRoom__resolvedKey != __key) {
            final DaoSession daoSession = this.daoSession;
            if (daoSession == null) {
                throw new DaoException("Entity is detached from DAO context");
            }
            ClassRoomDao targetDao = daoSession.getClassRoomDao();
            ClassRoom classRoomNew = targetDao.load(__key);
            synchronized (this) {
                classRoom = classRoomNew;
                classRoom__resolvedKey = __key;
            }
        }
        return classRoom;
    }
    /** called by internal mechanisms, do not call yourself. */
    @Generated(hash = 1179640613)
    public void setClassRoom(ClassRoom classRoom) {
        synchronized (this) {
            this.classRoom = classRoom;
            classRoomId = classRoom == null ? null : classRoom.getId();
            classRoom__resolvedKey = classRoomId;
        }
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
    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", stuName='" + stuName + '\'' +
                '}';
    }
    /** called by internal mechanisms, do not call yourself. */
    @Generated(hash = 1701634981)
    public void __setDaoSession(DaoSession daoSession) {
        this.daoSession = daoSession;
        myDao = daoSession != null ? daoSession.getStudentDao() : null;
    }
}
