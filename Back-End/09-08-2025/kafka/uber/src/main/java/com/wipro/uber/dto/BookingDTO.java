package com.wipro.uber.dto;

import java.time.LocalDate;
import lombok.Data;

@Data
public class BookingDTO {
    int id;
    String riderName;
    String pickupLocation;
    String dropLocation;
    boolean status;
    double fareAmount;
    LocalDate bookingDate;
}
