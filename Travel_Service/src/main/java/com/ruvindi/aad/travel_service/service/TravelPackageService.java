package com.ruvindi.aad.travel_service.service;

import com.ruvindi.aad.travel_service.entity.TravelPackage;

import java.util.List;

public interface TravelPackageService {
    TravelPackage addTravelPackage(TravelPackage travelPackage);

    TravelPackage updateTravelPackage(TravelPackage travelPackage);

    void deletePackage(Integer id);

    List<TravelPackage> fetchAllPackages();
}


