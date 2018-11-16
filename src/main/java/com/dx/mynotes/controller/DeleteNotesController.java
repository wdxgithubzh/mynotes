package com.dx.mynotes.controller;

import javax.annotation.Resource;

import com.dx.mynotes.entity.NoteResult;
import com.dx.mynotes.service.NotesService;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/notes")
public class DeleteNotesController {
    @Resource
    private NotesService notesService;
    @RequestMapping("/delete")
    @ResponseBody
    public NoteResult execute(String notesId) {
        NoteResult result = notesService.deleteNotes(notesId);
        return result;
    }
    
}