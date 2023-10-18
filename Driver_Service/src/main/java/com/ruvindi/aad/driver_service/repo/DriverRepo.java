package com.ruvindi.aad.driver_service.repo;

import com.ruvindi.aad.driver_service.entity.Driver;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DriverRepo extends JpaRepository<Driver,Integer> {
    boolean existsByIdAndName(Integer driverId,String name);
}
