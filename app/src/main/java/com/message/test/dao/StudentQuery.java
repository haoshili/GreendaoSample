package com.message.test.dao;


import com.message.test.entity.Student;
import com.message.test.entity.StudentDao;

import java.util.List;

/**
 * Created by shengjunhao on 16/11/15.
 */
public class StudentQuery {


    private StudentDao studentDao;

    public StudentQuery(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    public long getCount(String parentId) {

        return studentDao.queryBuilder().where(StudentDao.Properties.ClassRoomId.eq(parentId)).list().size();

    }

    public Student getLastStudent(String parentId) {
        List<Student> listStudent = studentDao.queryBuilder()
                .where(StudentDao.Properties.ClassRoomId.eq(parentId))
                .orderDesc(StudentDao.Properties.CreatTime)
                .list();
        return listStudent.get(0);
    }

}
