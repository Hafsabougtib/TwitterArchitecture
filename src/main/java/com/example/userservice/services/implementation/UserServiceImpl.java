package com.example.userservice.services.implementation;

import com.example.userservice.entities.User;

import com.example.userservice.exceptions.UserNotFoundException;
import com.example.userservice.repositories.UserRepository;
import com.example.userservice.services.UserService;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Date;
import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User getUser(Long userID) throws UserNotFoundException {
        User user = userRepository.findById(userID).orElseThrow(() -> new UserNotFoundException("User with ID : " + userID + " not found"));
        return user;
    }

    @Override
    public User saveUser(User user) {
        user.setCreatedAt(new Date());
        userRepository.save(user);
        return user;
    }

    @Override
    public void deleteUser(Long userID) {
        User user = getUser(userID);
        userRepository.delete(user);
    }

    @Override
    public User updateUser(User user) {
//        User originalUser = userRepository.getUserByEmail(user.getEmail());
//        originalUser.setFirstName(user.getFirstName());
//        originalUser.setLastName(user.getLastName());
//        originalUser.setPassword(user.getPassword());
//        originalUser.setFirstName(user.getFirstName());
        return user;
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
}
