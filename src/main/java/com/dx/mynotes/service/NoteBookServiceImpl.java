package com.dx.mynotes.service;

import java.util.List;

import javax.annotation.Resource;

import com.dx.mynotes.dao.NoteBookDao;
import com.dx.mynotes.entity.NoteBook;
import com.dx.mynotes.util.NoteResult;
import com.dx.mynotes.util.NoteUtil;

import org.springframework.stereotype.Service;

//将会被扫描到spring容器中
@Service("noteBookService")
public class NoteBookServiceImpl implements NoteBookService{
    @Resource
    NoteBookDao noteBookDao;
    
    //根据登录的用户ID查找笔记本的数据
    public NoteResult<List<NoteBook>> loadUserNoteBook(String userId) {
        //接收结果
        NoteResult<List<NoteBook>> result = new NoteResult<List<NoteBook>>();
        //查询
        List<NoteBook> nb = noteBookDao.findByUserId(userId);
        result.setStatus(0);
        result.setMsg("笔记本查询成功");
        result.setData(nb);
        return result;
    }
    //增加笔记本
    public NoteResult<NoteBook> addNoteBook(String userId,String title) {
        NoteBook nb = new NoteBook();
        //增加笔记本ID
        String noteBookId = NoteUtil.createId();
        nb.setNotebook_id(noteBookId);
        //增加用户ID
        nb.setNotebook_name(userId);
        //增加笔记本名称
        nb.setNotebook_name(title);
        
        //保存笔记本
        noteBookDao.addNoteBook(nb);
        //返回结果
        NoteResult<NoteBook> result = new NoteResult<NoteBook>();
        result.setStatus(0);
        result.setMsg("创建笔记本成功");
        result.setData(nb);
        return result;

    }
    
}