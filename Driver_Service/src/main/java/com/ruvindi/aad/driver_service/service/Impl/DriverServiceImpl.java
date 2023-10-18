package com.ruvindi.aad.driver_service.service.Impl;

import com.ruvindi.aad.driver_service.entity.Driver;
import com.ruvindi.aad.driver_service.repo.DriverRepo;
import com.ruvindi.aad.driver_service.service.DriverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DriverServiceImpl implements DriverService {

    @Autowired
    private DriverRepo driverRepo;

    @Override
    public void addDriver(Driver driver) {
        if (!driverRepo.existsByIdAndName(driver.getId(),driver.getName())){
            throw new RuntimeException("Driver already Exists");
        }
        driverRepo.save(driver);

    }

    @Override
    public List<Driver> fetchAllDriver() {
        return driverRepo.findAll();
    }

    @Override
    public boolean checkExistsDriver(Integer driverId, String name) {
        return driverRepo.existsByIdAndName(driverId,name);
    }

    @Override
    public void updateDriver(Driver driver) {
        if (driverRepo.existsByIdAndName(driver.getId(),driver.getName())){
            driverRepo.save(driver);
        }
        throw new RuntimeException("Driver Not Found");

    }
}
