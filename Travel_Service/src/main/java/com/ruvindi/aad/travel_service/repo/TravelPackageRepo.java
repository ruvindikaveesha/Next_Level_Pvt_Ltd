package com.ruvindi.aad.travel_service.repo;

import com.ruvindi.aad.travel_service.entity.TravelPackage;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TravelPackageRepo extends JpaRepository<TravelPackage,Integer> {
}
