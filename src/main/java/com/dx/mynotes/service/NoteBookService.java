package com.dx.mynotes.service;

import java.util.List;

import com.dx.mynotes.entity.NoteBook;
import com.dx.mynotes.entity.NoteResult;

public interface NoteBookService {
    //根据登录的用户ID查找笔记本的数据
    public NoteResult<List<NoteBook>> loadUserNoteBook(String userId);
    //添加笔记本名称
    public NoteResult<NoteBook> addNoteBook(String userId,String title);
}