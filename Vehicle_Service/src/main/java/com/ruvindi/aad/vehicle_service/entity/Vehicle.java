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
    private Integer id;
    private String regNumber;
    private String carName;
    private String category;
    private String brand;
    private String fuelUsage;
    private String fuelType;
    private String transmissionType;
    private Integer seatCapacity;
    private String status;
    private double pricePerDay;
}
