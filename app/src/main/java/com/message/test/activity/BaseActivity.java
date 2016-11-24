package com.message.test.activity;

import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.message.test.dao.base.Operate;

/**
 * Created by shengjunhao on 16/11/15.
 */
public class BaseActivity extends AppCompatActivity {

    public static Operate operate = Operate.getInstance();

    public void showToast(String msg){
        Toast.makeText(this,msg,Toast.LENGTH_SHORT).show();
    }
}
