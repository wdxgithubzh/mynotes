package com.dx.mynotes.service;

import java.util.List;

import com.dx.mynotes.entity.Share;
import com.dx.mynotes.util.NoteResult;

public interface ShareService {

    //分享笔记，实际是将被分享的笔记插入到分享表中
    public NoteResult<Object> shareNotes(String notesId);
    //把标题当关键字搜索被分享的笔记
    public NoteResult<List<Share>> findByTitleKeyWord(String titleKeyWord);
    //加载分享的笔记
    public NoteResult<Share> loadShareNotes(String shareId);
}