package com.next.user_service.service;

import com.next.user_service.entity.User;

import java.util.List;

public interface UserService {
    User addUser(User user);

    User updateUser(User user);

    void deleteUser(Integer id);

    List<User> fetchAllUsers();

    User checkLogin(String userName, String password);
    Object searchUser(Integer id);


}
