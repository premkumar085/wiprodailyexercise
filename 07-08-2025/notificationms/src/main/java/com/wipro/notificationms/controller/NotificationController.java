package com.wipro.notificationms.controller;

import com.wipro.notificationms.dto.NotificationRequest;
import com.wipro.notificationms.service.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class NotificationController {

    @Autowired
    private NotificationService notificationService;

    @PostMapping("/notify")
    public String notifyChange(@RequestBody NotificationRequest request) {
        notificationService.save(request);
        return "Notification saved";
    }
}
