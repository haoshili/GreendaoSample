package com.message.test.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.TextView;

import com.message.test.Utils.UUIDUtils;
import com.message.test.entity.ClassRoom;
import com.message.test.entity.Student;
import com.message.test.greendaosample.R;

/**
 * Created by shengjunhao on 16/11/15.
 */
public class DoubleTableActivity extends BaseActivity {


    private long allClassNumber;
    private long curClassStudentNumber;
    private ClassRoom lastClassRoom;
    private Student lastStudent;
    private TextView tv_show;
    private String result;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_double);
        tv_show = (TextView) findViewById(R.id.tv_show);
        showText();
    }

    public void addClass(View view) {

        ClassRoom classRoom = new ClassRoom();
        classRoom.setClassName("className" + allClassNumber);
        classRoom.setId(UUIDUtils.getShortUUId());
        classRoom.setCreatTime(System.currentTimeMillis());
        operate.getClassRoomDao().insert(classRoom);

        showText();

    }

    public void deleteClass(View view) {
        operate.getClassRoomDao().delete(lastClassRoom);
        showText();
    }

    public void addStudent(View view) {
        if (lastClassRoom == null) {
            showToast("当前班级数据为空");
            return;
        }
        Student student = new Student();
        student.setCreatTime(System.currentTimeMillis());
        student.setId(UUIDUtils.getShortUUId());
        student.setClassRoom(lastClassRoom);
        student.setStuName("stu" + curClassStudentNumber);
        operate.getStudentDao().insert(student);

        showText();
    }

    public void deleteStudent(View view) {

        //需要先查询出来，完后再次删除

        if (curClassStudentNumber > 0) {
            operate.getStudentDao().delete(lastStudent);
        } else {
            showToast("当前班级没有学生");
        }
        showText();
    }


    private void showText() {

        allClassNumber = operate.getClassRoomQuery().getCount();
        result = "";
        result += "班级数目:" + allClassNumber + "" + "\n";
        if (allClassNumber > 0) {
            lastClassRoom = operate.getClassRoomQuery().getLastClassRoom();
            result += lastClassRoom.toString() + "\n\n";

            //添加学生之后，不会更新
//            result += "学生数目" + lastClassRoom.getStudents().size();
            curClassStudentNumber = operate.getStudentQuery().getCount(lastClassRoom.getId());
            result += "    学生数目:" + curClassStudentNumber+"\n";
            if (curClassStudentNumber > 0) {
                lastStudent = operate.getStudentQuery().getLastStudent(lastClassRoom.getId());
                result += lastStudent.toString();
            }

        }
        tv_show.setText(result);
    }
}
