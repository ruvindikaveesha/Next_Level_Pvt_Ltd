package com.ruvindi.aad.vehicle_service.controller;

import com.ruvindi.aad.vehicle_service.entity.Vehicle;
import com.ruvindi.aad.vehicle_service.service.VehicleService;
import com.ruvindi.aad.vehicle_service.util.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("*")
@RequestMapping(value ="vehicle" )
public class VehicleController {
    @Autowired
    private VehicleService vehicleService;

    @PostMapping(value = "/add_vehicle")
    public Response addVehicle(@RequestBody Vehicle vehicle){
        return new Response("Ok","Vehicle Added",vehicleService.addVehicle(vehicle));
    }

    @PutMapping(value = "/update_vehicle")
    public Response updateVehicle(@RequestBody Vehicle vehicle){
        return new Response("OK","Vehicle_update",vehicleService.updateVehicle(vehicle));
    }

    @DeleteMapping(value = "delete_vehicle")
    public Response deleteVehicle(@RequestParam String regNumber){
        vehicleService.deleteVehicle(regNumber);
        return new Response("OK","Vehicle Deleted",null);
    }
    @GetMapping(value = "/category")
   public Response fetchAllVehicleByCategory(@RequestParam String category){
      return new Response("OK","",vehicleService.fetchAllVehicleByCategory(category));
    }

    @GetMapping(value = "/fetch_all")
    public Response fetchAllVehicle(){
        return new Response("OK","",vehicleService.fetchAllVehicle());
    }

    @GetMapping(value ="/search_Vehicle")
    public Response searchVehicle(Integer id){
        return new Response("Done","Okay",vehicleService.searchVehicleById(id));
    }


}
