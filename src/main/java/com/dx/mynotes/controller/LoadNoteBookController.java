package com.dx.mynotes.controller;

import java.util.List;

import javax.annotation.Resource;

import com.dx.mynotes.entity.NoteBook;
import com.dx.mynotes.entity.NoteResult;
import com.dx.mynotes.service.NoteBookService;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/notebook")
public class LoadNoteBookController {
    @Resource
    private NoteBookService noteBookService;
    @ResponseBody
    @RequestMapping("/loadNoteBook.do")
    public NoteResult<List<NoteBook>> execute(String userId) {
        NoteResult<List<NoteBook>> result = noteBookService.loadUserNoteBook(userId);
        return result;
    }
    
}