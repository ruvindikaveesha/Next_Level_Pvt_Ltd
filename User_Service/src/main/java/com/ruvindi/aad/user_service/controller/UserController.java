package com.ruvindi.aad.user_service.controller;

import com.ruvindi.aad.user_service.Dto.LoginDto;
import com.ruvindi.aad.user_service.entity.User;
import com.ruvindi.aad.user_service.service.Impl.UserService;
import com.ruvindi.aad.user_service.util.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin("*")
@RestController
@RequestMapping(value = "/user")

public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping(value = "/add_user")
    public Response addUser(@RequestBody User user){
        userService.addUser(user);
        return new Response("Okay","Added",null);
    }

    @PutMapping(value = "/update_user")
    public Response updateUser(@RequestBody User user){
        userService.updateUser (user);
        return new Response("Okay","Update",null);
    }


    @DeleteMapping(value = "/delete_user")
    public Response deleteUser(@RequestParam Integer id){
        userService.deleteUser(id);
        return new Response("Okay","Deleted",null);
    }

    @GetMapping(value = "/fetch_users")
    public Response fetchAllUsers(){
        return new Response("Okay","Done",userService.fetchAllUsers());}

    @GetMapping(value = "/check")
    public Response checkLogin(@RequestBody LoginDto LoginDto){
        userService.checkLogin(LoginDto.getUserName(),LoginDto.getPassword());
        return new Response("Okay","Badu Thiynwa",null);
    }


}
