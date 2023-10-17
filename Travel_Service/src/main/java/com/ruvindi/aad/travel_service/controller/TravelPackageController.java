package com.ruvindi.aad.travel_service.controller;

import com.ruvindi.aad.travel_service.entity.TravelPackage;
import com.ruvindi.aad.travel_service.service.TravelPackageService;
import com.ruvindi.aad.travel_service.util.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("*")
@RequestMapping(value = "/package")

public class TravelPackageController {
    @Autowired
    private TravelPackageService travelPackageService;

    @PostMapping(value = "/add_package")
    public Response addTravelPackage(@RequestBody TravelPackage travelPackage){
        travelPackageService.addTravelPackage(travelPackage);
        return new Response("Okay","Added","null");
    }

    @PostMapping(value = "/update_package")
    public Response updateTravelPackage(@RequestBody TravelPackage travelPackage){
        travelPackageService.updateTravelPackage(travelPackage);
        return new Response("Okay","Done","null");
    }

    @PostMapping(value = "/delete_package")
    public Response deletePackage(@RequestParam Integer id){
        travelPackageService.deletePackage(id);
        return new Response("Okay","Deleted","null");
    }

    @GetMapping(value = "/get_packages")
    public Response fetchAllPackages(){
        return new Response("Okay","Done",travelPackageService.fetchAllPackages());
    }

}
