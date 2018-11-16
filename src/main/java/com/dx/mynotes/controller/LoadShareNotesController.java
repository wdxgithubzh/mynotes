package com.dx.mynotes.controller;

import javax.annotation.Resource;

import com.dx.mynotes.entity.NoteResult;
import com.dx.mynotes.entity.Share;
import com.dx.mynotes.service.ShareService;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/share")
public class LoadShareNotesController {
    @Resource
    private ShareService shareService;
    @RequestMapping("/loadShareNotes")
    @ResponseBody
    public NoteResult<Share> execute(String shareId) {
        NoteResult<Share> result = shareService.loadShareNotes(shareId);
        return result;
    }

    
}