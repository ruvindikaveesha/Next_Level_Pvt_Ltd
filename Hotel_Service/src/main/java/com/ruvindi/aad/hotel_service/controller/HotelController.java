package com.ruvindi.aad.hotel_service.controller;

import com.ruvindi.aad.hotel_service.entity.Hotel;
import com.ruvindi.aad.hotel_service.service.HotelService;
import com.ruvindi.aad.hotel_service.util.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@CrossOrigin("*")
@RequestMapping(value = "/hotel")
public class HotelController {
    @Autowired
    private HotelService hotelService;

    @PostMapping(value = "/add")
    public Response addHotel(@RequestBody Hotel hotel){
        hotelService.addHotela(hotel);
        return new Response("Okay","Done and Added",null);
    }

    @GetMapping
    public Response fetchAllHotel(){
        return new Response("Okay","Done",hotelService.fetchAllHotel());

    }

    @GetMapping(value = "check")
    public Boolean checkHotelExists(@RequestParam Integer hotelId, @RequestParam String name){
        return hotelService.checkExistsHotel(hotelId,name);
    }
}
