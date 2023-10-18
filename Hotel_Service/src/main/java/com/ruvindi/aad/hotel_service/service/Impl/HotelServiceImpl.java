package com.ruvindi.aad.hotel_service.service.Impl;

import com.ruvindi.aad.hotel_service.entity.Hotel;
import com.ruvindi.aad.hotel_service.service.HotelService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HotelServiceImpl implements HotelService {


    @Override
    public Hotel addHotel(Hotel hotel) {
        return null;
    }

    @Override
    public List<Hotel> fetchAllHotel() {
        return null;
    }

    @Override
    public boolean checkExistsHotel(Integer hotelId, String name) {
        return false;
    }
}
