package com.dx.mynotes.entity;

import java.io.Serializable;

/**
 * 用户实体类
 */
public class User implements Serializable {
    
    //用户ID
    private String user_id;
    //用户名
    private String user_name;
    //用户密码
    private String user_password;
    //用户昵称
    private String user_nickname;



    public String getUser_id() {
        return this.user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getUser_name() {
        return this.user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getUser_password() {
        return this.user_password;
    }

    public void setUser_password(String user_password) {
        this.user_password = user_password;
    }

    public String getUser_nickname() {
        return this.user_nickname;
    }

    public void setUser_nickname(String user_nickname) {
        this.user_nickname = user_nickname;
    }

    @Override
    public String toString() {
        return "{" +
            " user_id='" + getUser_id() + "'" +
            ", user_name='" + getUser_name() + "'" +
            ", user_password='" + getUser_password() + "'" +
            ", user_nickname='" + getUser_nickname() + "'" +
            "}";
    }

}