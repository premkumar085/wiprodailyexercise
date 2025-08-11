package com.wipro.rider.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.wipro.rider.entity.Booking;
import com.wipro.rider.repo.BookingRepo;
import com.wipro.rider.util.AppConstant;

@Service
public class RiderListener {

    @Autowired BookingRepo bookingRepo;

    @KafkaListener(topics = AppConstant.INCOMING_TOPIC_NAME, groupId = "rider_uber")
    public void processUberResponse(Booking booking) {
        System.out.println("RiderListener: Received from Uber -> " + booking);
        Booking db = bookingRepo.findById(booking.getId()).orElse(null);
        if (db != null) {
            db.setStatus(booking.isStatus());
            bookingRepo.save(db);
            System.out.println("RiderListener: Updated booking in DB -> " + db);
        } else {
            System.out.println("RiderListener: booking id not found -> " + booking.getId());
        }
    }
}
