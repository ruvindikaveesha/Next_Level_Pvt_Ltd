package com.next.user_service.controller;


import com.next.user_service.dto.LoginDto;
import com.next.user_service.entity.User;
import com.next.user_service.service.UserService;
import com.next.user_service.utill.ResponseUtill;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("*")
@RequestMapping(value = "/user")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping(value = "/add_user")
    public ResponseUtill addUser(@RequestBody User user) {
        return new ResponseUtill("OK", "Added", userService.addUser(user));
    }

    @PutMapping(value = "/update_user")
    public ResponseUtill updateUser(@RequestBody User user) {
        return new ResponseUtill("OK", "Updated", userService.updateUser(user));
    }

    @DeleteMapping(value = "/delete_user")
    public ResponseUtill deleteUser(@RequestParam Integer id) {
        userService.deleteUser(id);
        return new ResponseUtill("OK", "User Deleted", null);
    }

    @GetMapping(value = "/fetch_users")
    public ResponseUtill fetchAllUsers() {
        return new ResponseUtill("OK", "", userService.fetchAllUsers());
    }

    @PostMapping(value = "/check")
    public ResponseUtill checkLogin(@RequestBody LoginDto loginDto) {
        return new ResponseUtill("OK", "Access Granted", userService.checkLogin(loginDto.getUserName()
                , loginDto.getPassword()));
    }

    @GetMapping(value = "/search_user")
    public ResponseUtill searchUser(@RequestParam Integer id ){
        return  new ResponseUtill("OK","Done",userService.searchUser(id));
    }
}
