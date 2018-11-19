package com.dx.mynotes.controller;

import javax.annotation.Resource;

import com.dx.mynotes.service.NotesService;
import com.dx.mynotes.util.NoteResult;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/notes")
public class UpdateNotesController {
    @Resource
    private NotesService notesService;
    @RequestMapping("/update.do")
    @ResponseBody
    public NoteResult<Object> execute(String notesId,String title,String content) {
        NoteResult<Object> result = notesService.updateNotes(notesId, title, content);
        return result;
    }
    
}