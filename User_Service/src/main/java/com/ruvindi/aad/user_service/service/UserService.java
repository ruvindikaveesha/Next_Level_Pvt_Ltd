package com.ruvindi.aad.user_service.service;

import com.ruvindi.aad.user_service.entity.User;

import java.util.List;

public interface UserService {
    User addUser(User user);

    User update(User user);

    void deleteUser(Integer id);

    List<User> fetchAllUsers();

    User chekLogin(String userName,String password);

    Object searchUser(Integer id);
}
