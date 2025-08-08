package com.wipro.notificationms.service.impl;

import com.wipro.notificationms.dto.NotificationRequest;
import com.wipro.notificationms.entity.Notification;
import com.wipro.notificationms.repo.NotificationRepo;
import com.wipro.notificationms.service.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NotificationServiceImpl implements NotificationService {

    @Autowired
    private NotificationRepo notificationRepo;

    @Override
    public void save(NotificationRequest request) {
        Notification notification = new Notification();
        notification.setUsername(request.getUsername());
        notification.setAddress(request.getAddress());
        notification.setAction(request.getAction());

        System.out.println("User " + request.getUsername() + " information is " + request.getAction());

        notificationRepo.save(notification);
    }

    @Override
    public List<Notification> findAll() {
        return notificationRepo.findAll();
    }
}
