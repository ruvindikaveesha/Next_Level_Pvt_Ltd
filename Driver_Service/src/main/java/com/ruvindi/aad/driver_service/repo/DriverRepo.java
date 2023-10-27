package com.ruvindi.aad.driver_service.repo;

import com.ruvindi.aad.driver_service.entity.Driver;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface DriverRepo extends JpaRepository<Driver,Integer> {
    boolean existsByIdAndName(Integer driverId,String name);

    @Query("SELECT drv FROM Driver drv WHERE  drv.status='Available'")
    Driver findFirstAvailableDriver();
}
