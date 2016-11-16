package com.message.test.dao.base;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import com.message.test.entity.DaoMaster;
import com.message.test.entity.NoteDao;

import org.greenrobot.greendao.database.Database;


/**
 * Created by shengjunhao on 16/11/14.
 */
public class OpenDataHelper extends DaoMaster.OpenHelper {

    public OpenDataHelper(Context context, String name) {
        super(context, name);
    }

    @Override
    public void onUpgrade(Database db, int oldVersion, int newVersion) {
        MigrationHelper.getInstance().migrate(db, NoteDao.class);
    }

}
