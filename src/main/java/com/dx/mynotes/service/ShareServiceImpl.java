package com.dx.mynotes.service;

import java.util.List;

import javax.annotation.Resource;
import javax.transaction.Transactional;

import com.dx.mynotes.dao.NotesDao;
import com.dx.mynotes.dao.ShareDao;
import com.dx.mynotes.entity.Notes;
import com.dx.mynotes.entity.Share;
import com.dx.mynotes.util.NoteResult;
import com.dx.mynotes.util.NoteUtil;

import org.springframework.stereotype.Service;

@Service("shareService")
@Transactional
public class ShareServiceImpl implements ShareService {
    @Resource
    private ShareDao shareDao;
    @Resource
    private NotesDao notesDao;
    //分享笔记(可以理解为将要分享的笔记插入到分享表中)
    public NoteResult<Object> shareNotes(String notesId) {
        //向分享表中插入记录
        Share share = new Share();
        String shareId = NoteUtil.createId();
        share.setNotes_share_id(shareId);
        share.setNotes_id(notesId);
        //获取笔记的标题和内容
        Notes notes = notesDao.findByNotesId(notesId);
        share.setNotes_share_title(notes.getNotes_title());
        share.setNotes_share_content(notes.getNotes_content());
        //记录分享记录
        shareDao.share(share);

        NoteResult<Object> result = new NoteResult<Object>();
        result.setStatus(0);
        result.setMsg("分享笔记成功");
        return result;
    }

    //把标题当关键字搜索被分享的笔记
    public NoteResult<List<Share>> findByTitleKeyWord(String titleKeyWord) {
        String title = "%" + titleKeyWord + "%";
        List<Share> shares = shareDao.findTitle(title);
        NoteResult<List<Share>> result = new NoteResult<List<Share>>();
        result.setStatus(0);
        result.setMsg("搜索成功");
        result.setData(shares);
        return result;
    }
    
    //加载分享的笔记
    public NoteResult<Share> loadShareNotes(String shareId) {
        Share share = shareDao.findById(shareId);
        NoteResult result = new NoteResult();
        result.setStatus(0);
        result.setMsg("成功加载已分享的笔记");
        result.setData(share);
        return result;
    }
    
}