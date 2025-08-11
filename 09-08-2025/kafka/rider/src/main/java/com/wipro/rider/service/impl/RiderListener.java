package com.wipro.rider.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.wipro.rider.entity.Booking;
import com.wipro.rider.repo.BookingRepo;
import com.wipro.rider.util.AppConstant;

@Service
public class RiderListener {

    @Autowired
    BookingRepo bookingRepo;

    @KafkaListener(topics = AppConstant.INCOMING_TOPIC_NAME, groupId = "rider_uber")
    public void processUberResponse(Booking booking) {
        System.out.println("--Message Received by Rider = " + booking);
        Booking bookingDb = bookingRepo.findById(booking.getId()).orElse(null);
        if (bookingDb != null) {
            bookingDb.setStatus(booking.isStatus());
            bookingRepo.save(bookingDb);
        }
    }
}
