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
        return hotelRepo.save(hotel);
    }

    @Override
    public Hotel updateHotel(Hotel hotel) {
        return hotelRepo.save(hotel);
    }

    @Override
    public void deleteHotel(Integer hotelId) {
        hotelRepo.deleteById(hotelId);

    }


    @Override
    public List<Hotel> fetchAllHotel() {
        return hotelRepo.findAll();
    }

    @Override
    public List<Hotel> findAllByStarRate(Integer starRate) {
        return hotelRepo.findAllByStarRate(starRate);
    }

    @Override
    public Object searchHotel(Integer id) {
        return hotelRepo.findById(id);
    }

}
