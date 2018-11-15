package com.dx.mynotes.service;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import com.dx.mynotes.dao.NotesDao;
import com.dx.mynotes.entity.NoteResult;
import com.dx.mynotes.entity.Notes;
import com.dx.mynotes.util.NoteUtil;

import org.springframework.stereotype.Service;

@Service("notesService")
public class NotesServiceImpl implements NotesService{

    @Resource
    private NotesDao notesDao;

    public NoteResult<List<Map>> loadNoteBookNotes(String noteBookId) {
        //返回数据
        List<Map> list = notesDao.findByNoteBook_Id(noteBookId);
        NoteResult<List<Map>> result = new NoteResult<List<Map>>();
        result.setStatus(0);
        result.setMsg("加载笔记成功");
        result.setData(list);
        return result;
    }
    //单击笔记加载笔记相关信息
    public NoteResult<Notes> loadNotes(String notesId) {
        //返回数据
        Notes notes = notesDao.findByNotes_Id(notesId);
        NoteResult<Notes> result = new NoteResult<Notes>();
        if (notes == null) {
            result.setMsg("未找到笔记");
            result.setStatus(1);
            return result;
        } else {
            result.setStatus(0);
            result.setMsg("笔记加载成功");
            result.setData(notes);
            return result;
        }

    }
    //更新笔记信息
    public NoteResult<Object> updateNotes(String notesId,String title,String content) {
        Notes notes = new Notes();
        notes.setNotes_id(notesId);
        notes.setNotes_title(title);
        notes.setNotes_content(content);
        
        Long time = System.currentTimeMillis();
        notes.setnotes_last_modify_time(time);
        //更新数据库
        int rows = notesDao.updateNotes(notes);
        NoteResult<Object> result = new NoteResult<Object>();
        if (rows == 1) {
            result.setStatus(0);
            result.setMsg("保存笔记成功");
            return result;
        } else {
            result.setStatus(1);
            result.setMsg("保存笔记失败");
            return result;
        }
    }
    //增加笔记
    public NoteResult<Notes> addNotes(String userId,String noteBookId,String title) {
        Notes notes = new Notes();
        notes.setUser_id(userId);
        notes.setNotebook_id(noteBookId);
        notes.setNotes_title(title);
        String notesId = NoteUtil.createId();
        notes.setNotes_id(notesId);
        notes.setNotes_content("");
        long time = System.currentTimeMillis();
        notes.setNotes_createtime(time);
        notes.setnotes_last_modify_time(time);
        //约定1：正常  2：删除
        notes.setnotes_status_id("1");
        //约定1：正常  2：收藏  3:分享
        notes.setnotes_type_id("1");
        notesDao.addNotes(notes);
        NoteResult<Notes> result = new NoteResult<Notes>();
        result.setStatus(0);
        result.setMsg("创建笔记成功");
        result.setData(notes);
        return result;
    }
    //删除笔记
    public NoteResult deleteNotes(String notesId) {
        Notes notes = new Notes();
        notes.setNotes_id(notesId);
        notes.setnotes_status_id("2");
        int rows = notesDao.deleteNotes(notes);
        NoteResult result = new NoteResult();
        if (rows >= 1) {
            result.setStatus(0);
            result.setMsg("删除笔记成功");
        } else {
            result.setStatus(1);
            result.setMsg("删除笔记失败");
        }
        return result;
    }
    //转移笔记
    public NoteResult<Object> moveNotes(String notesId,String noteBookId) {
        Notes notes = new Notes();
        notes.setNotes_id(notesId);
        notes.setNotebook_id(noteBookId);
        int rows = notesDao.deleteNotes(notes);
        NoteResult result = new NoteResult();
        if (rows >= 1) {
            result.setStatus(0);
            result.setMsg("转移笔记成功");
        } else {
            result.setStatus(1);
            result.setMsg("转移笔记失败");
        }
        return result;
    }
    
}