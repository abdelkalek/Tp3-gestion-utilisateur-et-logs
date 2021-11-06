package com.example.demo.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public User add(User user) {
        return   userRepository.save(user);
    }

    public List<User> getUserList() {
        return (List<User>) userRepository.findAll();
    }
}
