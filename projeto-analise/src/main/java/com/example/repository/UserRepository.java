package com.example.repository;

import com.example.model.User;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
public interface UserRepository extends JpaRepository<User, Integer> {
    List<User> findByName(String name);
    
    Optional<User> findById(Integer id);
 
}