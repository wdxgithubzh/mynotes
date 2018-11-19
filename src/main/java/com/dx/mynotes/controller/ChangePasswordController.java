package com.dx.mynotes.controller;

import javax.annotation.Resource;

import com.dx.mynotes.service.UserService;
import com.dx.mynotes.util.NoteResult;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/user")
public class ChangePasswordController {
    @Resource
    private UserService userService;
    @RequestMapping("/change.do")
    @ResponseBody
    public NoteResult<Object> execute(String userName,String last_password,String final_password) {
        NoteResult<Object> result = userService.changePassword(userName, last_password, final_password);
        return result;
    }

    
}