package com.dx.mynotes.controller;

import javax.annotation.Resource;

import com.dx.mynotes.entity.NoteResult;
import com.dx.mynotes.entity.Notes;
import com.dx.mynotes.service.NotesService;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/notes")
public class AddNotesController {

    @Resource
    private NotesService notesService;
    @RequestMapping("/add.do")
    @ResponseBody
    public NoteResult<Notes> execute(String userId,String noteBookId,String title) {
        NoteResult<Notes> result = notesService.addNotes(userId, noteBookId, title);
        return result;
    }
}