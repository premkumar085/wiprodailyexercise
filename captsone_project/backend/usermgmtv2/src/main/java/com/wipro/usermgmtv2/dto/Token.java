package com.wipro.usermgmtv2.dto;

import lombok.Data;

@Data
public class Token {
    private String token;
    private String role; 
    private int userId;
    
}
