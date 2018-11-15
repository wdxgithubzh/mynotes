package com.dx.mynotes.dao;

import java.util.List;

import com.dx.mynotes.entity.Share;

public interface ShareDao {

    //分享笔记，实际是将被分享的笔记插入到分享表中
    public void share(Share share);
    //根据标题搜索笔记
    public List<Share> findTitle(String title);
    //根据分享ID查找分享的笔记
    public Share findById(String shareId);
    
}