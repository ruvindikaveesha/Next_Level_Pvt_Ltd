package com.ruvindi.aad.common_service.controller;

import com.ruvindi.aad.common_service.dto.TravelPackageDTO;
import com.ruvindi.aad.common_service.dto.UserDTO;
import com.ruvindi.aad.common_service.service.TravelPackageService;
import com.ruvindi.aad.common_service.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping(value = "/home")
public class HomeController {
    @Autowired
    private UserService userService;

    @Autowired
    private TravelPackageService travelPackageService;

    @GetMapping(value = "/login")
    public Boolean checkLogin(@RequestParam String userName, @RequestParam String password){
        return userService.checkLoing(userName,password);
    }

    @PostMapping(value = "/create_user")
    public ResponseEntity<UserDTO> createUser(@RequestBody UserDTO userDTO){
        return userService.createUser(userDTO);
    }

    @GetMapping("/get_package")
    public List<TravelPackageDTO> getAllPackage(){
       return travelPackageService.getAllTravelPackages();
    }




}
