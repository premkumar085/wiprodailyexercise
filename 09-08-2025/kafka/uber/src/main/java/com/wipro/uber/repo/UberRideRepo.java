package com.wipro.uber.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.wipro.uber.entity.UberRide;

@Repository
public interface UberRideRepo extends JpaRepository<UberRide, Integer> { }
