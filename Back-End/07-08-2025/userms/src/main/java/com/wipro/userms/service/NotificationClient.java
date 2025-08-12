package com.wipro.userms.service;

import com.wipro.userms.dto.NotificationRequest;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient(name = "notificationms")
public interface NotificationClient {

    @PostMapping("/notify")
    String notifyChange(NotificationRequest request);
}
