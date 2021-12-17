package com.example.userservice.services;

import com.example.userservice.entities.User;

import java.util.List;

public interface UserService {
    User getUser(Long UserID);

    User saveUser(User user);

    void deleteUser(Long userID);

    User updateUser(User user);

    List<User> getAllUsers();

}
