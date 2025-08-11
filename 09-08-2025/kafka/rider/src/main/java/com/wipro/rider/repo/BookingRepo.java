package com.wipro.rider.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wipro.rider.entity.Booking;

@Repository
public interface BookingRepo extends JpaRepository<Booking, Integer> {
}
