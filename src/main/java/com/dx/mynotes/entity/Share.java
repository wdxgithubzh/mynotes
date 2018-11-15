package com.dx.mynotes.entity;

import java.io.Serializable;

/**
 * 分享类
 */
public class Share implements Serializable {

    //被分享的笔记在分享表中的ID
    private String notes_share_id;
    //被分享的笔记ID
    private String notes_id;
    //被分享的笔记的标题
    private String notes_share_title;
    //被分享的笔记的内容
    private String notes_share_content;



    public String getNotes_share_id() {
        return this.notes_share_id;
    }

    public void setNotes_share_id(String notes_share_id) {
        this.notes_share_id = notes_share_id;
    }

    public String getNotes_id() {
        return this.notes_id;
    }

    public void setNotes_id(String notes_id) {
        this.notes_id = notes_id;
    }

    public String getNotes_share_title() {
        return this.notes_share_title;
    }

    public void setNotes_share_title(String notes_share_title) {
        this.notes_share_title = notes_share_title;
    }

    public String getNotes_share_content() {
        return this.notes_share_content;
    }

    public void setNotes_share_content(String notes_share_content) {
        this.notes_share_content = notes_share_content;
    }

    @Override
    public String toString() {
        return "{" +
            " notes_share_id='" + getNotes_share_id() + "'" +
            ", notes_id='" + getNotes_id() + "'" +
            ", notes_share_title='" + getNotes_share_title() + "'" +
            ", notes_share_content='" + getNotes_share_content() + "'" +
            "}";
    }

}