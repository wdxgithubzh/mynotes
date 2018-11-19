package com.dx.mynotes.controller;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import com.dx.mynotes.service.NotesService;
import com.dx.mynotes.util.NoteResult;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/notes")
public class LoadNoteBookNotesController {
    @Resource
    private NotesService notesService;
    @RequestMapping("/loadnotebooknotes.do")
    @ResponseBody
    public NoteResult<List<Map>> execute(String noteBookId) {
        NoteResult<List<Map>> result = notesService.loadNoteBookNotes(noteBookId);
        return result;
    }

}