package com.wipro.uber.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.wipro.uber.entity.UberRide;
import com.wipro.uber.repo.UberRideRepo;

@RestController
@RequestMapping("/uber")
public class UberController {

    @Autowired UberRideRepo uberRideRepo;

    @PostMapping("/addRide")
    public void add(@RequestBody UberRide ride) {
        uberRideRepo.save(ride);
    }

    @GetMapping("/rides")
    public java.util.List<UberRide> all() {
        return uberRideRepo.findAll();
    }
}
