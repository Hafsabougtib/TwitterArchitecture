package com.example.userservice.controllers;

import com.example.userservice.entities.User;
import com.example.userservice.services.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api")
public class UserController {
    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping(path = "/users")
    List<User> getUsers() {
        return userService.getAllUsers();
    }

    @GetMapping(path = "/users/{id}")
    User getUsers(@PathVariable Long id) {
        return userService.getUser(id);
    }

    @PostMapping(path = "/addUser")
    User addUser(@RequestBody User newUser) {
        return userService.saveUser(newUser);
    }

    @PutMapping(path = "/updateUser")
    User updateUser(@RequestBody User user) {
        return userService.updateUser(user);
    }

    @DeleteMapping(path = "/deleteUser/{id}")
    void deleteUser(@PathVariable Long id) {
        userService.deleteUser(id);

    }
}
