package com.dx.mynotes.controller;

import javax.annotation.Resource;

import com.dx.mynotes.service.NotesService;
import com.dx.mynotes.util.NoteResult;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/notes")
public class MoveNotesController {
    @Resource
    private NotesService notesService;
    @RequestMapping("/move")
    @ResponseBody
    public NoteResult<Object> execute(String notesId,String noteBookId) {
        System.out.println("notesId=" + notesId);
        System.out.println("noteBookId=" + noteBookId);
        NoteResult<Object> result = notesService.moveNotes(notesId, noteBookId);
        return result;
    }
    
}