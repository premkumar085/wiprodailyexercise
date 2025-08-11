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

    @Autowired UberRideRepo uberRideRepo;
    @Autowired KafkaTemplate<String, BookingDTO> kafkaTemplate;

    @Override
    public void processBooking(BookingDTO booking) {
        System.out.println("UberService: Received booking -> " + booking);

        UberRide uberRide = new UberRide();
        uberRide.setBookingId(booking.getId());
        uberRide.setDriverName("Driver-" + (int)(Math.random()*1000));
        uberRide.setConfirmed(true);
        uberRideRepo.save(uberRide);
        System.out.println("UberService: saved uber_ride -> " + uberRide);

        booking.setStatus(true);
        kafkaTemplate.send(AppConstant.OUTGOING_TOPIC_NAME, booking);
        System.out.println("UberService: sent confirmation to Rider -> " + booking);
    }
}
