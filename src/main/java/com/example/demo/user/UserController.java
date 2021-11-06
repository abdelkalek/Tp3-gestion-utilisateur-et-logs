package com.example.demo.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "/user")
public class UserController {
    @Autowired
    private UserRepository userRepository;


    @PostMapping(value = "/add")
    public @ResponseBody String addNewUser (@RequestBody String name, @RequestBody String email ) {
        User u = new User();
        u.setName(name);
        u.setEmail(email);
        userRepository.save(u);
        return "Saved";
    }
    @GetMapping(path ="/all")
    public @ResponseBody Iterable<User> getAllUser(){
        return userRepository.findAll();
    }
}
