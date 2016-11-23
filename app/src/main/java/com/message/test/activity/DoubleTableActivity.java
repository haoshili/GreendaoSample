package com.message.test.activity;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.view.View;

import com.message.test.Utils.UUIDUtils;
import com.message.test.entity.ClassRoom;
import com.message.test.greendaosample.R;

import java.util.UUID;

/**
 * Created by shengjunhao on 16/11/15.
 */
public class DoubleTableActivity extends BaseActivity {


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_double);
    }

    public void addClass(View view) {

        ClassRoom classRoom = new ClassRoom();
        classRoom.setClassName("className");
        classRoom.setId(UUIDUtils.getShortUUId());

        operate.getClassRoomDao().insert(classRoom);

    }

    public void deleteClass(View view) {

    }

    public void addStudent(View view) {

    }

    public void deleteStudent(View view) {

    }


    private void showText() {

    }
}
