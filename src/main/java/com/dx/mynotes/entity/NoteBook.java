package com.dx.mynotes.entity;

import java.io.Serializable;

/**
 * 笔记本实体类
 */
public class NoteBook implements Serializable{
    
    //笔记本ID
    private String notebook_id;
    //用户ID 
    private String user_id;
    //笔记本类型ID
    private String notebook_type_id;
    //笔记本名
    private String notebook_name;
    //笔记本创建时间
    private String notebook_createtime;



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

    public String getNotebook_type_id() {
        return this.notebook_type_id;
    }

    public void setNotebook_type_id(String notebook_type_id) {
        this.notebook_type_id = notebook_type_id;
    }

    public String getNotebook_name() {
        return this.notebook_name;
    }

    public void setNotebook_name(String notebook_name) {
        this.notebook_name = notebook_name;
    }

    public String getNotebook_createtime() {
        return this.notebook_createtime;
    }

    public void setNotebook_createtime(String notebook_createtime) {
        this.notebook_createtime = notebook_createtime;
    }

    @Override
    public String toString() {
        return "{" +
            " notebook_id='" + getNotebook_id() + "'" +
            ", user_id='" + getUser_id() + "'" +
            ", notebook_type_id='" + getNotebook_type_id() + "'" +
            ", notebook_name='" + getNotebook_name() + "'" +
            ", notebook_createtime='" + getNotebook_createtime() + "'" +
            "}";
    }

}