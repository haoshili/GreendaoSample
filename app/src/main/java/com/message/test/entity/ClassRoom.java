package com.message.test.entity;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Property;

/**
 * Created by shengjunhao on 16/11/15.
 */

@Entity
public class ClassRoom {

    @Id
    private String id;
    
    private String className;

    private Long  creatTime;

    @Generated(hash = 1612720215)
    public ClassRoom(String id, String className, Long creatTime) {
        this.id = id;
        this.className = className;
        this.creatTime = creatTime;
    }

    @Generated(hash = 437777384)
    public ClassRoom() {
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getClassName() {
        return this.className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    @Override
    public String toString() {
        return "ClassRoom{" +
                "id='" + id + '\'' +
                ", className='" + className + '\'' +
                '}';
    }

    public Long getCreatTime() {
        return this.creatTime;
    }

    public void setCreatTime(Long creatTime) {
        this.creatTime = creatTime;
    }
}
