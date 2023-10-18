package com.ruvindi.aad.hotel_service.service.Impl;

import com.ruvindi.aad.hotel_service.entity.Hotel;
import com.ruvindi.aad.hotel_service.repo.HotelRepo;
import com.ruvindi.aad.hotel_service.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HotelServiceImpl implements HotelService {
    @Autowired
    private HotelRepo hotelRepo;

    @Override
    public Hotel addHotel(Hotel hotel) {
        if (hotelRepo.existsByIdAndName(hotel.getId(), hotel.getName())) {
            return hotelRepo.save(hotel);
        }
        throw new RuntimeException("Hotel Already Exists");
    }


    @Override
    public List<Hotel> fetchAllHotel() {
        return hotelRepo.findAll();
    }

    @Override
    public boolean checkExistsHotel(Integer hotelId, String name) {
        return hotelRepo.existsByIdAndName(hotelId,name);
    }
}
