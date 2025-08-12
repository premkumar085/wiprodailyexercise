package com.wipro.carmgmt.repo;

import com.wipro.carmgmt.entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepo extends JpaRepository<Car, Integer> {
}
