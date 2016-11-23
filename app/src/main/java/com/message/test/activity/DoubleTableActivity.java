package com.message.test.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.TextView;

import com.message.test.Utils.UUIDUtils;
import com.message.test.entity.ClassRoom;
import com.message.test.greendaosample.R;

/**
 * Created by shengjunhao on 16/11/15.
 */
public class DoubleTableActivity extends BaseActivity {


    private long allClassNumber;
    private ClassRoom lastClassRoom;
    private TextView tv_show;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_double);
        tv_show = (TextView) findViewById(R.id.tv_show);
        showText();
    }

    public void addClass(View view) {

        ClassRoom classRoom = new ClassRoom();
        classRoom.setClassName("className");
        classRoom.setId(UUIDUtils.getShortUUId());
        classRoom.setCreatTime(System.currentTimeMillis());
        operate.getClassRoomDao().insert(classRoom);

    }

    public void deleteClass(View view) {

    }

    public void addStudent(View view) {

    }

    public void deleteStudent(View view) {

    }


    private void showText() {

        allClassNumber = operate.getClassRoomQuery().getCount();
        tv_show.setText("班级数目："+ allClassNumber);

    }
}
