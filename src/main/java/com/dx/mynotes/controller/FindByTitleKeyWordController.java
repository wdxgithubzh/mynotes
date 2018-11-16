package com.dx.mynotes.controller;

import java.util.List;

import javax.annotation.Resource;

import com.dx.mynotes.entity.NoteResult;
import com.dx.mynotes.entity.Share;
import com.dx.mynotes.service.ShareService;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/share")
public class FindByTitleKeyWordController {
    @Resource
    private ShareService shareService;
    @RequestMapping("/findByTitleKeyWord.do")
    @ResponseBody
    public NoteResult<List<Share>> execute(String titleKeyWord) {
        NoteResult<List<Share>> result = shareService.findByTitleKeyWord(titleKeyWord);
        return result;
    }
    
}