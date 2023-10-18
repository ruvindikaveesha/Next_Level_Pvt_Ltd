package com.ruvindi.aad.hotel_service.repo;

import com.ruvindi.aad.hotel_service.entity.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HotelRepo extends JpaRepository<Hotel,Integer> {

}
