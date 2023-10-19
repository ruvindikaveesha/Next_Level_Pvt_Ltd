package com.ruvindi.aad.user_service.service.Impl;

import com.ruvindi.aad.user_service.entity.User;
import com.ruvindi.aad.user_service.repo.UserRepo;
import com.ruvindi.aad.user_service.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepo userRepo;

    @Override
    public User addUser(User user) {
        if(userRepo.existsByUserName(user.getUserName())){
            throw new RuntimeException("User Already Exists");
        }
        return userRepo.save(user);
    }

    @Override
    public User updateUser(User user) {
        if(userRepo.existsByUserName(user.getUserName())){
            throw new  RuntimeException("User Not Found");
        }
        return userRepo.save(user);
    }

    @Override
    public void deleteUser(Integer id) {
        if (!userRepo.existsById(id)){
            throw new RuntimeException("User Not Found");
        }
        userRepo.deleteById(id);

    }

    @Override
    public List<User> fetchAllUsers() {
        return userRepo.findAll();
    }

    @Override
    public Boolean checkLogin(String userName, String password) {
        if (!userRepo.existsByUserName(userName)){
            throw new RuntimeException("User Not Found");
        }
        return userRepo.existsUserByUserNameAndPassword(userName,password);
    }
}
