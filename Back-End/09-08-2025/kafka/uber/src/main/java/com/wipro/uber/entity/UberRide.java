package com.wipro.uber.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name="uber_ride")
@Data
public class UberRide {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    @Column(name="booking_id")
    Integer bookingId; 

    @Column(name="driver_name")
    String driverName;

    @Column(name="confirmed")
    boolean confirmed;
}
