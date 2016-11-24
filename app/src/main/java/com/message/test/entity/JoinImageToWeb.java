package com.message.test.entity;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Generated;

/**
 * Created by shengjunhao on 2016/11/24.
 */

@Entity
public class JoinImageToWeb {

    @Id
    private String id;

    private String webId;

    private String imageId;

    @Generated(hash = 155490729)
    public JoinImageToWeb(String id, String webId, String imageId) {
        this.id = id;
        this.webId = webId;
        this.imageId = imageId;
    }

    @Generated(hash = 649804252)
    public JoinImageToWeb() {
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getWebId() {
        return this.webId;
    }

    public void setWebId(String webId) {
        this.webId = webId;
    }

    public String getImageId() {
        return this.imageId;
    }

    public void setImageId(String imageId) {
        this.imageId = imageId;
    }
}
