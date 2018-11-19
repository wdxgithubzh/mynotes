package com.dx.mynotes.controller;

import javax.annotation.Resource;

import com.dx.mynotes.entity.User;
import com.dx.mynotes.service.UserService;
import com.dx.mynotes.util.NoteResult;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/user")
public class CheckLoginController {
    @Resource
    private UserService userService;
    @RequestMapping("/checklogin.do")
    @ResponseBody
    public NoteResult<User> execute(String userName,String password) {
        System.out.println(userName + "," + password);
        NoteResult<User> result = userService.checkLogin(userName, password);
        return result;
    }
    
}