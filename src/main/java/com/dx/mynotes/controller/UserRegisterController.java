package com.dx.mynotes.controller;

import javax.annotation.Resource;

import com.dx.mynotes.entity.NoteResult;
import com.dx.mynotes.service.UserService;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/user")
public class UserRegisterController {
    @Resource
    private UserService userService;
    @RequestMapping("/add.do")      //注册用户即添加一个用户
    @ResponseBody
    public NoteResult<Object> execute(String userName,String password,String nickName) {
        NoteResult<Object> result = userService.addUser(userName, password, nickName);
        System.out.println(result);
        return result;
    }
    
}