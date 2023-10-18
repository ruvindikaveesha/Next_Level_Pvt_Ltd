package com.ruvindi.aad.driver_service.service.Impl;

import com.ruvindi.aad.driver_service.entity.Driver;
import com.ruvindi.aad.driver_service.service.DriverService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DriverServiceImpl implements DriverService {
    @Override
    public void addDriver(Driver driver) {

    }

    @Override
    public List<Driver> fetchAllDriver() {
        return null;
    }

    @Override
    public boolean checkExistsDriver(Integer driverId, String name) {
        return false;
    }

    @Override
    public void updateDriver(Driver driver) {

    }
}
