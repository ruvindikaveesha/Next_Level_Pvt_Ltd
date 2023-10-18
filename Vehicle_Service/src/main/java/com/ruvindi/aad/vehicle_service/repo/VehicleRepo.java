package com.ruvindi.aad.vehicle_service.repo;

import com.ruvindi.aad.vehicle_service.entity.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface VehicleRepo extends JpaRepository<Vehicle,String> {

    Boolean existsByRegNumber(String regNumber);

    void deleteByRegNumber(String regNumber);

    List<Vehicle> findByCategory(String category);
}
