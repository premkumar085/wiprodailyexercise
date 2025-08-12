package com.wipro.rider.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.wipro.rider.entity.Booking;
import com.wipro.rider.service.RiderService;

@RestController
@RequestMapping("/rider")
public class RiderController {

    @Autowired RiderService riderService;

    @PostMapping("/book")
    public void book(@RequestBody Booking booking) {
        riderService.bookRide(booking);
    }

    @GetMapping("/status/{id}")
    public Booking getStatus(@PathVariable int id, @Autowired com.wipro.rider.repo.BookingRepo repo) {
        return repo.findById(id).orElse(null);
    }
}
