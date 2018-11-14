package com.dx.mynotes.util;

import java.security.MessageDigest;
import java.util.UUID;

import org.apache.commons.codec.binary.Base64;

public class NoteUtil {
    /**
     * 利用UUID生成主键
     * UUID(Universally Unique Identifier)全局唯一标识，指在一台机器上生成的数字，
     * 它保证在对同一时空中的所有机器都是唯一的。
     * @return
     */
    public static String createId() {
        UUID uuid = UUID.randomUUID();
        return uuid.toString().replace("-","");
    }

    /**
     * MD5加密，将传入的src加密
     */
    public static String md5(String src) {
        try {
            //将字符串信息采用MD5处理
            MessageDigest md = MessageDigest.getInstance("MD5");
            //得到MD5处理结果
            byte[] output = md.digest(src.getBytes());
            //将MD5处理结果用Base64转成字符串
            String ss = Base64.encodeBase64String(output);
            return ss;
        } catch (Exception e) {
            throw new NoteException("密码加密失败", e);
        }
    }

    public static void main(String[] args) throws Exception{
        System.out.println(md5("12345678"));
        System.out.println(md5("1235342dnfasdfjfjfjegd"));
        System.out.println(createId());
        System.out.println(createId());

    }
}