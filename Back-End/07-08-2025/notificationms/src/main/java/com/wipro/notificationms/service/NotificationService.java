package com.wipro.notificationms.service;

import com.wipro.notificationms.dto.NotificationRequest;
import com.wipro.notificationms.entity.Notification;

import java.util.List;

public interface NotificationService {
    void save(NotificationRequest request);
    List<Notification> findAll();
}
