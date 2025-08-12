package com.wipro.letsgo.service;


import java.util.List;

import com.wipro.letsgo.dto.VehicleMovementRequest;
import com.wipro.letsgo.entity.VehicleMovement;

public interface VehicleMovementService {
    void saveMovement(VehicleMovementRequest request);
    List<VehicleMovement> getAllMovements();
    void deleteMovement(int id);
}
