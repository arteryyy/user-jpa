/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.ipan.user.jpa.repository;
import com.ipan.user.jpa.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author user
 */
public interface UserRepository extends JpaRepository<User, Long>{

    public User findByUserId(Long userId);
    
}
