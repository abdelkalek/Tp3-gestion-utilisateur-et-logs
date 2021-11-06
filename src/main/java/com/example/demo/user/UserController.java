package com.example.demo.user;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping(value = {"/all", "/"})
    public List<User> getlistUser() {
        return userService.getUserList();
    }

    @PostMapping(value = {"/add"})
    public User creatnewUser(@RequestBody User user) {
        return userService.add(user);
    }



}
