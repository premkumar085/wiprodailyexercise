package com.wipro.notificationms.dto;

import lombok.Data;

@Data
public class NotificationRequest {
    private String username;
    private String address;
    private String action;
}
