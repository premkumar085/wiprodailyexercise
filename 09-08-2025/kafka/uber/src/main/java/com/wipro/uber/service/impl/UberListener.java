package com.wipro.uber.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.wipro.uber.dto.BookingDTO;
import com.wipro.uber.service.UberService;
import com.wipro.uber.util.AppConstant;

@Service
public class UberListener {

    @Autowired
    UberService uberService;

    @KafkaListener(topics = AppConstant.INCOMING_TOPIC_NAME, groupId = "uber_rider")
    public void receiveBooking(BookingDTO booking) {
        uberService.processBooking(booking);
    }
}
