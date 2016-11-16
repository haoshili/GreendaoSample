package com.message.test.dao;


import com.message.test.entity.Note;
import com.message.test.entity.NoteDao;

import java.util.List;

/**
 * Created by shengjunhao on 16/11/15.
 */
public class NoteQuery {

    private NoteDao noteDao;

    public NoteQuery(NoteDao noteDao) {
        this.noteDao = noteDao;
    }


    public Note getLastNote() {
        List<Note> lsitNote = noteDao.queryBuilder().orderDesc(NoteDao.Properties.Id).list();
        return lsitNote.get(0);
    }

    public long getCount() {
        return noteDao.count();
    }
}
