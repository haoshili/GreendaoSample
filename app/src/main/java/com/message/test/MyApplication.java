package com.message.test;

import android.app.Application;
import android.content.Context;

import com.facebook.stetho.Stetho;

/**
 * Created by shengjunhao on 16/11/14.
 */
public class MyApplication extends Application {

    private static Context context;

    public static Context getContext() {
        if(context == null){
            context = getContext();
        }
        return context;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        context = getApplicationContext();
        Stetho.initializeWithDefaults(this);
    }
}
