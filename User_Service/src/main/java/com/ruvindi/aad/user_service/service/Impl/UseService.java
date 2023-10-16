package com.ruvindi.aad.user_service.service.Impl;

import com.ruvindi.aad.user_service.entity.User;

import java.util.List;

public interface UseService {
    User addUser(User user);

    User updateUser(User user);

    void deleateUser(Integer id);

    List<User> fetchAllUsers();

    Boolean checkLogin(String userName,String password);
}
