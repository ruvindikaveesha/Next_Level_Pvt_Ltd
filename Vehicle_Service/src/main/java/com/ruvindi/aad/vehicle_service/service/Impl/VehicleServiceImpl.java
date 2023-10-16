package com.ruvindi.aad.vehicle_service.service.Impl;

import com.ruvindi.aad.vehicle_service.entity.Vehicle;
import com.ruvindi.aad.vehicle_service.repo.VehicleRepo;
import com.ruvindi.aad.vehicle_service.service.VehicleService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Transactional
@Service
public class VehicleServiceImpl implements VehicleService {
    @Autowired
    private VehicleRepo vehicleRepo;

    @Override
    public Vehicle addVehicle(Vehicle vehicle) {
        if(vehicleRepo.existsByRegNumberAndBrand(vehicle.getRegNumber(),vehicle.getBrand())){
            return vehicleRepo.save(vehicle);
        }
        throw new RuntimeException(("Vehicle Already Exists"));
    }

    @Override
    public List<Vehicle> fetchAllVehicle() {
        return vehicleRepo.findAll();
    }

    @Override
    public boolean checkExistsVehicle(String regNmuber, String brand) {
        return vehicleRepo.existsByRegNumberAndBrand(regNmuber,brand);
    }
}
