package com.wipro.letsgo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.wipro.letsgo.entity.VehicleMovement;

@Repository
public interface VehicleMovementRepo extends JpaRepository<VehicleMovement, Integer> {
}
