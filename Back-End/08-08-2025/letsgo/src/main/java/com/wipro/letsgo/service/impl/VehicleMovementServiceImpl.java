package com.wipro.letsgo.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.wipro.letsgo.dto.VehicleMovementRequest;
import com.wipro.letsgo.entity.VehicleMovement;
import com.wipro.letsgo.repo.VehicleMovementRepo;
import com.wipro.letsgo.service.VehicleMovementService;

import java.util.List;

@Service
public class VehicleMovementServiceImpl implements VehicleMovementService {

    @Autowired
    VehicleMovementRepo repo;

    @Override
    public void saveMovement(VehicleMovementRequest request) {
        VehicleMovement movement = new VehicleMovement();
        movement.setVehId(request.getVehId());
        movement.setLat(request.getLat());
        movement.setLon(request.getLon());
        repo.save(movement);
    }

    @Override
    public List<VehicleMovement> getAllMovements() {
        return repo.findAll();
    }

    @Override
    public void deleteMovement(int id) {
        repo.deleteById(id);
    }
}
