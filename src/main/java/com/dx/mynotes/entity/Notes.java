package com.dx.mynotes.entity;

import java.io.Serializable;
import java.sql.Date;

/**
 * 笔记实体类
 */
public class Notes implements Serializable{

    private String notes_id;
    private String notebook_id;
    private String user_id;
    private String notes_title;
    private String notes_content;
    private Date notes_createtime;

    

    public String getNotes_id() {
        return this.notes_id;
    }

    public void setNotes_id(String notes_id) {
        this.notes_id = notes_id;
    }

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

    public String getNotes_title() {
        return this.notes_title;
    }

    public void setNotes_title(String notes_title) {
        this.notes_title = notes_title;
    }

    public String getNotes_content() {
        return this.notes_content;
    }

    public void setNotes_content(String notes_content) {
        this.notes_content = notes_content;
    }

    public Date getNotes_createtime() {
        return this.notes_createtime;
    }

    public void setNotes_createtime(Date notes_createtime) {
        this.notes_createtime = notes_createtime;
    }


    @Override
    public String toString() {
        return "{" +
            " notes_id='" + getNotes_id() + "'" +
            ", notebook_id='" + getNotebook_id() + "'" +
            ", user_id='" + getUser_id() + "'" +
            ", notes_title='" + getNotes_title() + "'" +
            ", notes_content='" + getNotes_content() + "'" +
            ", notes_createtime='" + getNotes_createtime() + "'" +
            "}";
    }
}