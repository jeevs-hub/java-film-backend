/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.techprimers.mongodb.springbootmongodbexample.service;

import com.techprimers.exception.InvalidDataInputException;
import com.techprimers.mongodb.springbootmongodbexample.document.User;
import com.techprimers.mongodb.springbootmongodbexample.repository.UserRepository;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author Jeevan
 */
public class UserServiceImpl implements UserService {
    private UserRepository userRepository;
    
    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    
    @Override
    public List<User> listAll() {
        if(true)
            throw new InvalidDataInputException("does the error hadnling work?");

        return this.userRepository.findAll();
    }
    
    @Override
    public String register(String user) {
        if(user.equals("test")) 
        {
            throw new InvalidDataInputException("does the error hadnling work?");
        }
        return "test";
    }
}
