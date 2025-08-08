package com.wipro.letsgo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.wipro.letsgo.dto.VehicleMovementRequest;
import com.wipro.letsgo.entity.VehicleMovement;
import com.wipro.letsgo.service.VehicleMovementService;

import java.util.List;

@RestController
public class VehicleMovementController {

    @Autowired
    VehicleMovementService service;

    @PostMapping("/move")
    public String move(@RequestBody VehicleMovementRequest request) {
        service.saveMovement(request);
        return "Vehicle movement saved";
    }

    @GetMapping("/move")
    public List<VehicleMovement> getMovements() {
        return service.getAllMovements();
    }

    @DeleteMapping("/move/{id}")
    public String deleteMovement(@PathVariable int id) {
        service.deleteMovement(id);
        return "Vehicle movement deleted";
    }
}
