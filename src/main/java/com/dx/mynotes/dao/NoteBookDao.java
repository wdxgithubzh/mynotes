package com.dx.mynotes.dao;

import java.util.List;

import com.dx.mynotes.entity.NoteBook;

public interface NoteBookDao extends BaseDao{

    /**
     * 根据登录的用户ID找到所有的笔记本
     * @param userId
     * @return
     */
    public List<NoteBook> findByUserId(String userId);

    /**
     * 增加笔记本
     * @param noteBook
     */
    public void addNoteBook(NoteBook noteBook);
    
}