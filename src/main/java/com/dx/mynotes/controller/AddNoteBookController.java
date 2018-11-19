package com.dx.mynotes.controller;

import javax.annotation.Resource;

import com.dx.mynotes.entity.NoteBook;
import com.dx.mynotes.service.NoteBookService;
import com.dx.mynotes.util.NoteResult;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/noteBook")
public class AddNoteBookController {

    @Resource
    private NoteBookService noteBookService;
    @RequestMapping("/add.do")
    @ResponseBody
    public NoteResult<NoteBook> execute(String userId,String title) {
        NoteResult<NoteBook> result = noteBookService.addNoteBook(userId, title);
        return result;
    }
}