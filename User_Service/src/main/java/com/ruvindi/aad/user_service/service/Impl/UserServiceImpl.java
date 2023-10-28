package com.ruvindi.aad.user_service.service.Impl;

import com.ruvindi.aad.user_service.entity.User;
import com.ruvindi.aad.user_service.repo.UserRepo;
import com.ruvindi.aad.user_service.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepo userRepo;

    @Override
    public User addUser(User user) {
        if (userRepo.existsByUserName(user.getUserName())) {
            throw new RuntimeException("User Already Exists");
        }
        return userRepo.save(user);
    }


    @Override
    public User updateUser(User user) {
        if (!userRepo.existsById(user.getId())) {
            throw new RuntimeException("User Not Found");
        }
        return userRepo.save(user);
    }

    @Override
    public void deleteUser(Integer id) {
        if (!userRepo.existsById(id)) {
            throw new RuntimeException("User Not Found");
        }
        userRepo.deleteById(id);
    }

    @Override
    public Object searchUser(Integer id) {
        return userRepo.findById(id);
    }

    @Override
    public List<User> fetchAllUsers() {
        return userRepo.findAll();
    }

    @Override
    public User checkLogin(String userName, String password) {
        if (!userRepo.existsByUserNameAndPassword(userName,password)) {
            throw new RuntimeException("User Not Found");
        }
        return userRepo.findByUserNameAndPassword(userName, password);
    }
}



