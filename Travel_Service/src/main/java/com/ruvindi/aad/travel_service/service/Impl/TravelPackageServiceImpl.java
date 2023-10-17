package com.ruvindi.aad.travel_service.service.Impl;

import com.ruvindi.aad.travel_service.entity.TravelPackage;
import com.ruvindi.aad.travel_service.repo.TravelPackageRepo;
import com.ruvindi.aad.travel_service.service.TravelPackageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TravelPackageServiceImpl implements TravelPackageService {
    @Autowired
    private  TravelPackageRepo travelPackageRepo;
    @Override
    public void addTravelPackage(TravelPackage travelPackage) {
        if(travelPackageRepo.existsById(travelPackage.getId())){
            travelPackageRepo.save(travelPackage);
        }
        throw new RuntimeException("PACKAGE Already Exists");
    }

    @Override
    public TravelPackage updateTravelPackage(TravelPackage travelPackage) {
        if(travelPackageRepo.existsById(travelPackage.getId())){
            travelPackageRepo.save(travelPackage);
        }
        throw new RuntimeException("PACKAGE Already Exists");

    }

    @Override
    public void deletePackage(Integer id) {
        if(travelPackageRepo.existsById(id)){
          travelPackageRepo.deleteById(id);
        }
        throw new RuntimeException("PACKAGE not find");

    }

    @Override
    public List<TravelPackage> fetchAllPackages() {
        return travelPackageRepo.findAll();
    }


}
