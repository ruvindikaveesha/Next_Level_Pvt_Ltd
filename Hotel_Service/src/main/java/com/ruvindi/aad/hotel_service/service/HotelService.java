package com.ruvindi.aad.hotel_service.service;

import com.ruvindi.aad.hotel_service.entity.Hotel;

import java.util.List;

public interface HotelService {

    Hotel addHotela(Hotel hotel);

    List<Hotel> fetchAllHotel();

    boolean checkExistsHotel(Integer hotelId,String name);
}
