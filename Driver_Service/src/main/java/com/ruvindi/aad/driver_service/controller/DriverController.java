package com.ruvindi.aad.driver_service.controller;

import com.ruvindi.aad.driver_service.entity.Driver;
import com.ruvindi.aad.driver_service.service.DriverService;
import com.ruvindi.aad.driver_service.util.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("*")
@RequestMapping("/driver")
public class DriverController {
    @Autowired
    private DriverService driverService;

    @PostMapping(value = "/add_driver")
    public Response addDriver(@RequestBody Driver driver){
        driverService.addDriver(driver);
        return new Response("Okay","Sucsesfully Register",null);
    }

    @PostMapping(value = "update_driver")
    public Response updateDriver(@RequestBody Driver driver){
        driverService.updateDriver(driver);
        return new Response("Okay","Done",null);
    }

    @GetMapping(value = "/fetch_driver")
    public Response fetchAllUsers(){
        return new Response("Okay","Done",driverService.fetchAllDriver());
    }

    @GetMapping(value = "/check")
    public Boolean checkExistsDriver(@RequestParam Integer driverId,@RequestParam String name){
        return driverService.checkExistsDriver(driverId,name);

    }


}
