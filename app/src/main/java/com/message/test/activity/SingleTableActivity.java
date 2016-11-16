package com.message.test.activity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.message.test.entity.Note;
import com.message.test.greendaosample.R;

public class SingleTableActivity extends BaseActivity {

    private TextView textView;
    private Note note;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single);
        textView = (TextView) findViewById(R.id.tv_show);
        showTextView();
    }

    public void insertData(View view) {
        operate.getNoteDao().insert(new Note(null, "test"));
        showTextView();

    }


    public void updataData(View view) {

        note.setText("我被更新了！！！！");
        operate.getNoteDao().update(note);
        showTextView();
    }

    public void deleteData(View view) {

        long count = operate.getNoteQuery().getCount();
        if (count == 0) {
            Toast.makeText(this, "没有数据", Toast.LENGTH_LONG).show();

        } else {
            Note note = operate.getNoteQuery().getLastNote();
            operate.getNoteDao().delete(note);
            showTextView();
        }
    }

    /**
     * 显示
     */
    private void showTextView() {
        note = operate.getNoteQuery().getLastNote();
        textView.setText(note.toString());
    }

}
