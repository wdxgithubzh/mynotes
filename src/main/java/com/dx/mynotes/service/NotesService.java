package com.dx.mynotes.service;

import java.util.List;
import java.util.Map;

import com.dx.mynotes.entity.NoteResult;
import com.dx.mynotes.entity.Notes;

public interface NotesService {

    //根据点击的笔记本ID，从而返回一个笔记本中的笔记
    public NoteResult<List<Map>> loadNoteBookNotes(String noteBookId);

    //单击笔记加载笔记相关信息
    public NoteResult<Notes> loadNotes(String notesId);

    //更新笔记信息
    public NoteResult<Object> updateNotes(String notesId,String title,String content);

    //增加笔记
    public NoteResult<Notes> addNotes(String userId,String noteBookId,String title);

    //删除笔记
    public NoteResult deleteNotes(String notesId);
    
    //转移笔记
    public NoteResult moveNotes(String notesId,String noteBookId);

}