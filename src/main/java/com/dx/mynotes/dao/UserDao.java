package com.dx.mynotes.dao;

import com.dx.mynotes.entity.User;

public interface UserDao extends BaseDao {

    //查找登录的用户，返回找到的用户名
    public User findByName(String name);

    //保存一个用户名（即注册用户）
    public void addUser(User user);

    //修改密码
    public void changePassword(User user);
    
}