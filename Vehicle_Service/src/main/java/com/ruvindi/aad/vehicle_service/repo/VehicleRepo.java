package com.ruvindi.aad.vehicle_service.repo;

import com.ruvindi.aad.vehicle_service.entity.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehicleRepo extends JpaRepository<Vehicle,String> {
    Boolean existsByRegNumberAndBrand(String regNumber,String brand);

}
