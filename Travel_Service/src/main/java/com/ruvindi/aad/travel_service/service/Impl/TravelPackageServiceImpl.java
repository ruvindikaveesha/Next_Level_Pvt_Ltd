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
    private TravelPackageRepo travelPackageRepo;

    @Override
    public TravelPackage addTravelPackage(TravelPackage travelPackage) {
        if (travelPackageRepo.existsByPackageCategory(travelPackage.getPackageCategory())){
            throw new RuntimeException("Package Already Exists");
        }
        return travelPackageRepo.save(travelPackage);
    }

    @Override
    public TravelPackage updateTravelPackage(TravelPackage travelPackage) {
        if(!travelPackageRepo.existsById(travelPackage.getId())) {
            throw new RuntimeException("Package Not Found");
        }
        return travelPackageRepo.save(travelPackage);
    }

    @Override
    public void deletePackage(Integer id) {
        if (!travelPackageRepo.existsById(id)){
            throw new RuntimeException("Package Not Found");
        }
        travelPackageRepo.deleteById(id);

    }

    @Override
    public List<TravelPackage> fetchAllPackages() {
        return travelPackageRepo.findAll();
    }
}
