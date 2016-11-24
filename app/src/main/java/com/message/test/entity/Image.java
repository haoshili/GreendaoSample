package com.message.test.entity;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Generated;

/**
 * Created by shengjunhao on 2016/11/24.
 */

@Entity
public class Image {

    @Id
    private String id;

    private String imageName;

    private long creatTime;

    @Generated(hash = 217959841)
    public Image(String id, String imageName, long creatTime) {
        this.id = id;
        this.imageName = imageName;
        this.creatTime = creatTime;
    }

    @Generated(hash = 1590301345)
    public Image() {
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getImageName() {
        return this.imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    public long getCreatTime() {
        return this.creatTime;
    }

    public void setCreatTime(long creatTime) {
        this.creatTime = creatTime;
    }
}
