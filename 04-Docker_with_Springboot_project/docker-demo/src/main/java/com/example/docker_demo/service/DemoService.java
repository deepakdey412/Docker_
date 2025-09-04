package com.example.docker_demo.service;

import com.example.docker_demo.model.User;
import com.example.docker_demo.repository.UserRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DemoService {
    private final UserRepo userRepo;

    public DemoService(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    public User createUser(User user){
        return userRepo.save(user);
    }

    public List<User> getAllUser(){
        return userRepo.findAll();
    }
}
