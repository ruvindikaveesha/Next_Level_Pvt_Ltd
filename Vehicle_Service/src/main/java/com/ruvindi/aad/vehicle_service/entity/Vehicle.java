package com.ruvindi.aad.vehicle_service.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Data
@Table(name = "vehicle_details")

public class Vehicle {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String regNumber;
    private String category;
    private String brand;
    private String fuelUsage;
    private String fuelType;
    private String frontImgUrl;
    private String rearImgUrl;
    private String vehicleType;
    private String transmissionType;
    private int seatCapacity;
    private boolean hybrid;

}
