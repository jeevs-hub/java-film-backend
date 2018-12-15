/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.techprimers.mongodb.springbootmongodbexample.service;

import com.techprimers.constants.Constants;
import com.techprimers.exception.InvalidDataInputException;
import com.techprimers.model.UserRegisterModel;
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
        return userRepository.findAll();
    }
    
    public String register(UserRegisterModel user) {
        System.out.println("the user in the service" + user.toString());
        if(!user.isValidEmail()) throw new InvalidDataInputException(Constants.EMAIL_EXCEPTION_MESSAGE);
        if(!user.isValidPassword()) throw new InvalidDataInputException(Constants.PASSWORD_EXCEPTION_MESSAGE);
        
        return "test";
    }
}
