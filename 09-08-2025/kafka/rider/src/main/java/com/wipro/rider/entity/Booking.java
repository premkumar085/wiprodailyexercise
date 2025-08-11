package com.wipro.rider.entity;

import java.time.LocalDate;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name="booking")
@Data
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    @Column(name="rider_name")
    String riderName;

    @Column(name="pickup_location")
    String pickupLocation;

    @Column(name="drop_location")
    String dropLocation;

    @Column(name="status")
    boolean status;

    @Column(name="fare_amount")
    double fareAmount;

    @Column(name="booking_date")
    LocalDate bookingDate;
}
