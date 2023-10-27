package com.ruvindi.aad.hotel_service.service;

import com.ruvindi.aad.hotel_service.entity.Hotel;

import java.util.List;

public interface HotelService {

    Hotel addHotel(Hotel hotel);

    Hotel updateHotel(Hotel hotel);

    void deleteHotel(Integer hotelId);

    List<Hotel> fetchAllHotel();

    List<Hotel>findAllByStarRate(Integer starRate);

    Object searchHotel(Integer id);
}
