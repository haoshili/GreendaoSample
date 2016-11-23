package com.message.test.dao.base;

import com.message.test.MyApplication;
import com.message.test.dao.ClassRoomQuery;
import com.message.test.dao.NoteQuery;
import com.message.test.entity.ClassRoomDao;
import com.message.test.entity.DaoMaster;
import com.message.test.entity.DaoSession;
import com.message.test.entity.NoteDao;

/**
 * Created by shengjunhao on 16/11/15.
 * <p/>
 * 获取操作数据库的各个实体类
 */
public class Operate {

    private static Operate operate;
    private static DaoSession daoSession;

    private NoteQuery noteQuery;
    private ClassRoomQuery classRoomQuery;


    public static Operate getInstance() {
        if (operate == null || daoSession == null) {

            OpenDataHelper dataHelper = new OpenDataHelper(MyApplication.getContext(), "notedb");
            DaoMaster daoMaster = new DaoMaster(dataHelper.getWritableDatabase());
            daoSession = daoMaster.newSession();
            operate = new Operate();
        }
        return operate;
    }

    ////////////////////////// 获取查询实体 ////////////////////////


    /**
     * 处理查询
     *
     * @return
     */
    public NoteQuery getNoteQuery() {
        if (noteQuery == null) {
            noteQuery = new NoteQuery(daoSession.getNoteDao());
        }
        return noteQuery;
    }

    /**
     * 处理新增，修改，删除
     *
     * @return
     */
    public NoteDao getNoteDao() {
        return daoSession.getNoteDao();
    }


    public ClassRoomDao getClassRoomDao(){
        return daoSession.getClassRoomDao();
    }

    public ClassRoomQuery getClassRoomQuery(){
        if(classRoomQuery == null){
            classRoomQuery = new ClassRoomQuery(daoSession.getClassRoomDao());
        }
        return classRoomQuery;
    }

}
