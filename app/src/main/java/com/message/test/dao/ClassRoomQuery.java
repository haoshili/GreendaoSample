package com.message.test.dao;

import com.message.test.entity.ClassRoom;
import com.message.test.entity.ClassRoomDao;

import java.util.List;

/**
 * Created by shengjunhao on 16/11/15.
 */
public class ClassRoomQuery {

    private ClassRoomDao classRoomDao;

    public ClassRoomQuery(ClassRoomDao classRoomDao) {
        this.classRoomDao = classRoomDao;
    }

    public long getCount() {
        return classRoomDao.count();
    }

    /**
     * 获取最后一个教室实体类
     *
     * @return
     */
    public ClassRoom getLastClassRoom() {

        List<ClassRoom> listClassRoom = classRoomDao.queryBuilder().orderDesc(ClassRoomDao.Properties.CreatTime).list();

        return listClassRoom.get(0);
    }
}
