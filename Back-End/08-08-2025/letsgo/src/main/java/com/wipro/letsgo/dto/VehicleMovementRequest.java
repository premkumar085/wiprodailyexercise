package com.wipro.letsgo.dto;

import lombok.Data;

@Data
public class VehicleMovementRequest {
    int vehId;
    double lat;
    double lon;
}