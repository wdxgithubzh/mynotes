package com.dx.mynotes.service;

import com.dx.mynotes.entity.NoteResult;
import com.dx.mynotes.entity.User;

public interface UserService {

    //查找登录的用户，返回找到的用户名
    public NoteResult<User> checkLogin(String userName,String password);

    //保存一个用户名（即注册用户）
    public NoteResult<Object> addUser(String userName,String password,String nickName);

    //修改密码
    public NoteResult<Object> changePassword(String userName,String last_password,String final_password);

}