package com.dx.mynotes.entity;

import java.io.Serializable;

public class User implements Serializable {

    private String user_id;
    private String user_name;
    private String user_password;
    private String user_nick;

    

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

    public String getUser_nick() {
        return this.user_nick;
    }

    public void setUser_nick(String user_nick) {
        this.user_nick = user_nick;
    }

    @Override
    public String toString() {
        return "{" +
            " user_id='" + getUser_id() + "'" +
            ", user_name='" + getUser_name() + "'" +
            ", user_password='" + getUser_password() + "'" +
            ", user_nick='" + getUser_nick() + "'" +
            "}";
    }

}