package com.wipro.uber.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.wipro.uber.dto.BookingDTO;
import com.wipro.uber.entity.UberRide;
import com.wipro.uber.repo.UberRideRepo;
import com.wipro.uber.service.UberService;
import com.wipro.uber.util.AppConstant;

@Service
public class UberServiceImpl implements UberService {

    @Autowired
    UberRideRepo uberRideRepo;

    @Autowired
    KafkaTemplate<String, BookingDTO> kafkaTemplate;

    @Override
    public void processBooking(BookingDTO booking) {
        System.out.println("---Message Received by Uber---" + booking);
        UberRide available = uberRideRepo.findAll().stream().filter(UberRide::isAvailable).findFirst().orElse(null);
        if (available != null) {
            booking.setStatus(true);
            // Optionally mark the ride as not available
            available.setAvailable(false);
            uberRideRepo.save(available);
        } else {
            booking.setStatus(false);
        }
        kafkaTemplate.send(AppConstant.OUTGOING_TOPIC_NAME, booking);
    }
}
