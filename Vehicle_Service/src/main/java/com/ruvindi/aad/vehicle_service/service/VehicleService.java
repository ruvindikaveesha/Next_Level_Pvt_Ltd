package com.ruvindi.aad.vehicle_service.service;

import com.ruvindi.aad.vehicle_service.entity.Vehicle;

import java.util.List;

public interface VehicleService {
    Vehicle addVehicle(Vehicle vehicle);
    Vehicle updateVehicle(Vehicle vehicle);
    void deleteVehicle(String regNumber);
    List<Vehicle> fetchAllVehicleByCategory(String category);


}
