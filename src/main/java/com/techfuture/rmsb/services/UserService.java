package com.techfuture.rmsb.services;

import com.techfuture.rmsb.models.User;
import com.techfuture.rmsb.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;
    //Get All user
    public List<User> getAllUser(){
        List<User> users = (List<User>) userRepository.findAll();
        return users;
    }
    //Get a User by id
    public User getUserById(long id){
        Optional<User> optionalUser = userRepository.findById(id);
        User user = optionalUser.get();
        return user;
    }
    //Get user by first name
    public List<User> getUserByFirstName(String firstName){
        List<User> userList = userRepository.getUserByUserFirstName(firstName);
        return userList;
    }
    //Get user by last name
    public List<User> getUserByLastName(String lastName){
        List<User> userList = userRepository.getUserByUserLastName(lastName);
        return userList;
    }

    //Save a user
    public User saveUser(User user){
        User savedUser = userRepository.save(user);
        return savedUser;
    }
    //Save all user
    public List<User> saveAllUser(List<User> userList){
        List<User> savedUserList= userRepository.saveAll(userList);
        return savedUserList;
    }


    //Update a User by id

    //Delete a User by id

    //delete all User
}
