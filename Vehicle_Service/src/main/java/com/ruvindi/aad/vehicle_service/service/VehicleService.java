package com.ruvindi.aad.vehicle_service.service;

import com.ruvindi.aad.vehicle_service.entity.Vehicle;

import java.util.List;

public interface VehicleService {
    Vehicle addVehicle(Vehicle vehicle);
    List<Vehicle> fetchAllVehicle();
    boolean checkExistsVehicle(String regNmuber, String brand);

}
