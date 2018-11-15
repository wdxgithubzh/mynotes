package com.dx.mynotes.entity;

import java.io.Serializable;

/**
 * 笔记实体类
 */
public class Notes implements Serializable{

    //笔记ID
    private String notes_id;
    //笔记所属笔记本ID
    private String notebook_id;
    //笔记所属用户ID
    private String user_id;
    //笔记状态ID
    private String notes_status_id;
    //笔记类型ID
    private String notes_type_id;
    //笔记标题
    private String notes_title;
    //笔记内容
    private String notes_content;
    //笔记创建时间
    private Long notes_createtime;
    //笔记最后修改时间
    private Long notes_last_modifytime;



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

    public String getNotes_status_id() {
        return this.notes_status_id;
    }

    public void setNotes_status_id(String notes_status_id) {
        this.notes_status_id = notes_status_id;
    }

    public String getNotes_type_id() {
        return this.notes_type_id;
    }

    public void setNotes_type_id(String notes_type_id) {
        this.notes_type_id = notes_type_id;
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

    public Long getNotes_createtime() {
        return this.notes_createtime;
    }

    public void setNotes_createtime(Long notes_createtime) {
        this.notes_createtime = notes_createtime;
    }

    public Long getNotes_last_modifytime() {
        return this.notes_last_modifytime;
    }

    public void setNotes_last_modifytime(Long notes_last_modifytime) {
        this.notes_last_modifytime = notes_last_modifytime;
    }

    @Override
    public String toString() {
        return "{" +
            " notes_id='" + getNotes_id() + "'" +
            ", notebook_id='" + getNotebook_id() + "'" +
            ", user_id='" + getUser_id() + "'" +
            ", notes_status_id='" + getNotes_status_id() + "'" +
            ", notes_type_id='" + getNotes_type_id() + "'" +
            ", notes_title='" + getNotes_title() + "'" +
            ", notes_content='" + getNotes_content() + "'" +
            ", notes_createtime='" + getNotes_createtime() + "'" +
            ", notes_last_modifytime='" + getNotes_last_modifytime() + "'" +
            "}";
    }

}