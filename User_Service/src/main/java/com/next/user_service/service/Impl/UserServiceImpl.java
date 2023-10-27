package com.next.user_service.service.Impl;

import com.next.user_service.entity.User;
import com.next.user_service.repository.UserRepository;
import com.next.user_service.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public User addUser(User user) {
        if (userRepository.existsByUserName(user.getUserName())) {
            throw new RuntimeException("User Already Exists");
        }
        return userRepository.save(user);
    }

    @Override
    public User updateUser(User user) {
        if (!userRepository.existsById(user.getId())) {
            throw new RuntimeException("User Not Found");
        }
        return userRepository.save(user);
    }

    @Override
    public void deleteUser(Integer id) {
        if (!userRepository.existsById(id)) {
            throw new RuntimeException("User Not Found");
        }
        userRepository.deleteById(id);
    }
    @Override
    public User checkLogin(String userName, String password) {
        if (!userRepository.existsByUserNameAndPassword(userName,password)) {
            throw new RuntimeException("User Not Found");
        }
        return userRepository.findByUserNameAndPassword(userName, password);
    }

    @Override
    public Object searchUser(Integer id) {
        return userRepository.findById(id);
    }

    @Override
    public List<User> fetchAllUsers() {
        return userRepository.findAll();
    }
}
