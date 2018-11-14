package com.dx.mynotes.entity;

import java.io.Serializable;

public class NoteResult<T> implements Serializable {

    private int status;
    private String msg;
    //定义泛型成员变量
    private T data;



    public int getStatus() {
        return this.status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMsg() {
        return this.msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return this.data;
    }

    public void setData(T data) {
        this.data = data;
    }
    
    @Override
    public String toString() {
        return "{" +
            " status='" + getStatus() + "'" +
            ", msg='" + getMsg() + "'" +
            ", data='" + getData() + "'" +
            "}";
    }
    
}