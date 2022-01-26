package com.java.puzzle.springbootrestapivalidation.service;

import com.java.puzzle.springbootrestapivalidation.entity.User;
import com.java.puzzle.springbootrestapivalidation.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public User createUser(User user){
        return userRepository.save(user);
    }
}
