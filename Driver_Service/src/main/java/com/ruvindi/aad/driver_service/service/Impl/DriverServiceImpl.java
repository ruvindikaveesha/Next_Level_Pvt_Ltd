package com.ruvindi.aad.driver_service.service.Impl;

import com.ruvindi.aad.driver_service.entity.Driver;
import com.ruvindi.aad.driver_service.repo.DriverRepo;
import com.ruvindi.aad.driver_service.service.DriverService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class DriverServiceImpl implements DriverService {
    @Autowired
    private DriverRepo driverRepo;
    @Override
    public Driver addDriver(Driver driver) {
        return driverRepo.save(driver);
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
        if (!driverRepo.existsById(driver.getId())){
            throw new RuntimeException("Driver Not Found");
        }
        driverRepo.save(driver);
    }

    @Override
    public Driver searchDriver(Integer id) {
        return driverRepo.findById(id).get();
    }

    @Override
    public Driver getAvailableDriver() {
        Driver availableDriver = driverRepo.findFirstAvailableDriver();
        if (availableDriver == null ){
            throw new RuntimeException("There is no available Driver at this moment");
        }
        availableDriver.setStatus("Unavailable");
        updateDriver(availableDriver);
        return availableDriver;
    }



}
