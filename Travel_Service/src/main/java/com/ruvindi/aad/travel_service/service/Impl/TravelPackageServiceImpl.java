package com.ruvindi.aad.travel_service.service.Impl;

import com.ruvindi.aad.travel_service.entity.TravelPackage;
import com.ruvindi.aad.travel_service.service.TravelPackageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TravelPackageServiceImpl implements TravelPackageService {
    @Autowired
    private     TravelPackageService travelPackageService;
    @Override
    public void addTravelPackage(TravelPackage travelPackage) {
        if(travelPackageRepo.existById(travelPackage.getId())){
            travelPackageRepo.save(travelPackage);
        }
        throw new RuntimeException("PACKAGE Already Exists");
    }

    @Override
    public TravelPackage updateTravelPackage(TravelPackage travelPackage) {
        return null;
    }

    @Override
    public void deletePackage(Integer id) {

    }

    @Override
    public List<TravelPackage> fetchAllPackage() {
        return null;
    }
}
