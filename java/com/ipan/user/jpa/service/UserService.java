/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ipan.user.jpa.service;

import com.ipan.user.jpa.entity.User;
import com.ipan.user.jpa.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author user
 */
@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;
    
     public User saveUser(User user){
        return userRepository.save(user);
    }
    
    public User findUserById(Long userId){
        return userRepository.findByUserId(userId);
    }

}
