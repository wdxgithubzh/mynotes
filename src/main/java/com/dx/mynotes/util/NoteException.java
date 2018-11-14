package com.dx.mynotes.util;

/**
 * 自定义异常类
 * spring事务管理时，只有遇到RuntimeException时才回滚
 */
public class NoteException extends RuntimeException {
    public NoteException(String msg,Throwable t) {
        super(msg,t);
    }
}