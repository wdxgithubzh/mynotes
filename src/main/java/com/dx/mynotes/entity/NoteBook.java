package com.dx.mynotes.entity;

import java.io.Serializable;

/**
 * 笔记本实体类
 */
public class NoteBook implements Serializable{

    private String notebook_id;
    private String user_id;
    private String notebook_name;


    
    public String getNotebook_id() {
        return this.notebook_id;
    }

    public void setNotebook_id(String notebook_id) {
        this.notebook_id = notebook_id;
    }

    public String getUser_id() {
        return this.user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getNotebook_name() {
        return this.notebook_name;
    }

    public void setNotebook_name(String notebook_name) {
        this.notebook_name = notebook_name;
    }

    @Override
    public String toString() {
        return "{" +
            " notebook_id='" + getNotebook_id() + "'" +
            ", user_id='" + getUser_id() + "'" +
            ", notebook_name='" + getNotebook_name() + "'" +
            "}";
    }


}