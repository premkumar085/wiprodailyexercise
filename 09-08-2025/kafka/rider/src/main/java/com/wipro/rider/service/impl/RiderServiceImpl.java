package com.wipro.rider.service.impl;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.wipro.rider.entity.Booking;
import com.wipro.rider.repo.BookingRepo;
import com.wipro.rider.service.RiderService;
import com.wipro.rider.util.AppConstant;

@Service
public class RiderServiceImpl implements RiderService {

    @Autowired
    BookingRepo bookingRepo;

    @Autowired
    KafkaTemplate<String, Booking> kafkaTemplate;

    @Override
    public void bookRide(Booking booking) {
        booking.setStatus(false);
        booking.setBookingDate(LocalDate.now());
        bookingRepo.save(booking);
        kafkaTemplate.send(AppConstant.OUTGOING_TOPIC_NAME, booking);
    }

    @Override
    public void sendToUber(Booking booking) {
        kafkaTemplate.send(AppConstant.OUTGOING_TOPIC_NAME, booking);
    }
}
