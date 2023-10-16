package com.ruvindi.aad.vehicle_service.controller;

import com.ruvindi.aad.vehicle_service.entity.Vehicle;
import com.ruvindi.aad.vehicle_service.service.VehicleService;
import com.ruvindi.aad.vehicle_service.utill.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("*")
@RequestMapping(value ="vehicle" )
public class VehicleController {
    @Autowired
    private VehicleService vehicleService;

    @PostMapping(value = "/add")
    public Response addVehicle(@RequestBody Vehicle vehicle){
        vehicleService.addVehicle(vehicle);
        return new Response("Okay","Added",null);

    }

    @GetMapping(value = "fetch_All_User")
    public Response fetchAllVehicle(){
        return new Response("Okay","Done",vehicleService.fetchAllVehicle());}

    @GetMapping(value = "/chek")
    public Boolean checkVehicleExists(@RequestParam String regNumber,@RequestParam String brand){
        return vehicleService.checkExistsVehicle(regNumber,brand);
    }


}
