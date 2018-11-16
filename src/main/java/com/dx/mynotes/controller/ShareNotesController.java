package com.dx.mynotes.controller;

import javax.annotation.Resource;

import com.dx.mynotes.entity.NoteResult;
import com.dx.mynotes.service.ShareService;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/share")
public class ShareNotesController {
    @Resource
    private ShareService shareService;
    @RequestMapping("/share.do")        //TODO:此处有不同
    @ResponseBody
    public NoteResult<Object> execute(String notesId) {
        NoteResult<Object> result = shareService.shareNotes(notesId);
        return result;
    }
    
}