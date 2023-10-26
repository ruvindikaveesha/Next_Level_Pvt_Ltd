package com.ruvindi.aad.vehicle_service.repo;

import com.ruvindi.aad.vehicle_service.entity.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VehicleRepo extends JpaRepository<Vehicle,Integer> {

    Boolean existsByRegNumber(String regNumber);

    void deleteByRegNumber(String regNumber);

    List<Vehicle> findByCategory(String category);
}
