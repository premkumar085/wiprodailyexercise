package com.wipro.usermgmtv2.util;

import org.springframework.security.crypto.bcrypt.BCrypt;

public class EncryptUtil {

    public static String getEncryptedPassword(String plainPassword,String salt) {
        if(salt==null) {
            salt= BCrypt.gensalt();
        }
        return BCrypt.hashpw(plainPassword, salt);
    }

    public static void main(String[] args) {
        System.out.println(getEncryptedPassword("pass",null));
    }
}
