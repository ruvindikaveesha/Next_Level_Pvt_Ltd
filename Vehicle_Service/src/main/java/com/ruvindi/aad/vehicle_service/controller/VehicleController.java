package com.ruvindi.aad.vehicle_service.controller;

import com.ruvindi.aad.vehicle_service.entity.Vehicle;
import com.ruvindi.aad.vehicle_service.service.Impl.VehicleService;
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

}
