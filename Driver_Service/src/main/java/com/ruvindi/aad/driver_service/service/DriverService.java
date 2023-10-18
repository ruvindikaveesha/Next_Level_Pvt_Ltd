package com.ruvindi.aad.driver_service.service;

import com.ruvindi.aad.driver_service.entity.Driver;

import java.util.List;

public interface DriverService {
    void addDriver (Driver driver);

    List<Driver> fetchAllDriver();

    boolean checkExistsDriver(Integer driverId, String name);

    void  updateDriver(Driver driver);

}
