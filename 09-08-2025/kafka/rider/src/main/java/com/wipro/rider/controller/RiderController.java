package com.wipro.rider.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.wipro.rider.entity.Booking;
import com.wipro.rider.service.RiderService;

@RestController
@RequestMapping("/rider")
public class RiderController {

    @Autowired
    RiderService riderService;

    @PostMapping("/book")
    void book(@RequestBody Booking booking) {
        riderService.bookRide(booking);
    }
}
