package com.techfuture.rmsb.controllers;

import com.techfuture.rmsb.models.User;
import com.techfuture.rmsb.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("rms/api/v1/user")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/")
    public List<User> getAllUser() {
        List<User> allUser = userService.getAllUser();
        return allUser;
    }

    @GetMapping("/{id}")
    public User getUserById(@PathVariable("id") long id) {
        User user = userService.getUserById(id);
        return user;
    }

    @GetMapping("/fname/{fname}")
    public List<User> getUserByFirstName(@PathVariable("userFirstName") String userFirstName) {
        List<User> userList = userService.getUserByFirstName(userFirstName);
        return userList;
    }

    @GetMapping("/lname/{lname}")
    public List<User> getUserByLastName(@PathVariable("lname") String lname) {
        List<User> userList = userService.getUserByLastName(lname);
        return userList;
    }

    @PostMapping("/save")
    public String saveUser(@RequestBody User user) {
        userService.saveUser(user);
        return "Success";
    }

    @PostMapping("/saveall")
    public ResponseEntity<String> saveAllUser(@RequestBody List<User> userlist) {
        List<User> savedUserList = userService.saveAllUser(userlist);
        if (savedUserList.size()<=0) {
            return new ResponseEntity<>("Failed", HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>("Success", HttpStatus.CREATED);
    }
}
