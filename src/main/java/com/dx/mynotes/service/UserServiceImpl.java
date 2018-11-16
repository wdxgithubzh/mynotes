package com.dx.mynotes.service;

import javax.annotation.Resource;

import com.dx.mynotes.dao.UserDao;
import com.dx.mynotes.entity.NoteResult;
import com.dx.mynotes.entity.User;
import com.dx.mynotes.util.NoteUtil;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("userService")
@Transactional
public class UserServiceImpl implements UserService {
    @Resource
    private UserDao userDao;

    public NoteResult<User> checkLogin(String name,String password) {
        //接收结果
        NoteResult<User> result = new NoteResult<User>();
        //按参数查询数据库
        User user = userDao.findByName(name);
        //检测用户名
        if (user == null) {
            result.setStatus(1);
            result.setMsg("用户名不存在");
            return result;
        }
        //检测密码
        //对输入的密码进行加密，然后进行比较
        String md5Password = NoteUtil.md5(password);
        if (!user.getUser_password().equals(md5Password)) {
            result.setStatus(2);
            result.setMsg("密码错误");
            return result;
        }
        //用户名、密码都正确
        result.setStatus(0);
        result.setMsg("登录成功");
        result.setData(user);
        return result;
    }

    //保存一个用户名（即注册用户）
    public NoteResult<Object> addUser(String name,String password,String nickName) {
        //接收结果
        NoteResult<Object> result = new NoteResult<Object>();
        //用户检测
        User hasUser = userDao.findByName(name);
        if (hasUser != null) {
            //用户名已存在
            result.setStatus(1);
            result.setMsg("用户名已经被占用");
            return result;
        }
        //用户名可用，添加用户
        User user = new User();
        //设置用户名
        user.setUser_name(name);
        //设置密码，密码的存储需要MD5加密
        String md5Password = NoteUtil.md5(password);
        user.setUser_password(md5Password);
        //设置昵称
        user.setUser_nickname(nickName);
        //设置主键ID
        String id = NoteUtil.createId();
        user.setUser_id(id);
        //保存
        userDao.addUser(user);
        result.setStatus(0);
        result.setMsg("注册成功");
        return result;
    }
    
    //更改用户密码
    public NoteResult<Object> changePassword(String userName,String last_password,String final_password) {
      //返回结果
      NoteResult<Object> result = new NoteResult<Object>();
      //已登录用户信息
      User user = userDao.findByName(userName);
      //获得原密码
      String User_password = user.getUser_password();
      //对传入的密码进行加密后进行比较
      last_password = NoteUtil.md5(last_password);
      final_password = NoteUtil.md5(final_password);
      System.out.println(User_password);
      System.out.println(last_password);
      System.out.println(final_password);

      if (!User_password.equals(last_password)) {
          result.setStatus(1);
          result.setMsg("原密码不正确");
          return result;
      } else if (User_password.equals(final_password)) {
          result.setStatus(2);
          result.setMsg("新密码与原密码相同");
          return result;
      } else {
          //新密码输入正确
          user.setUser_password(final_password);
          userDao.changePassword(user);
          result.setStatus(0);
          result.setMsg("修改密码成功");
          return result;
      }

    }

}