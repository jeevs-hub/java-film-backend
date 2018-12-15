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
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

/**
 *
 * @author Jeevan
 */
@Service
public class UserServiceImpl implements UserService {
    private UserRepository userRepository;
    private final BCryptPasswordEncoder bCryptPasswordEncoder;

    @Autowired
    public UserServiceImpl(UserRepository userRepository, BCryptPasswordEncoder bCryptPasswordEncoder) {
        this.userRepository = userRepository;
        this.bCryptPasswordEncoder = bCryptPasswordEncoder;
    }
    
    @Override
    public List<User> listAll() {
        return userRepository.findAll();
    }
    
    @Override
    public User register(User user) {
        System.out.println("the user in the service" + user.toString());
        if(userRepository.findByEmail(user.getEmail()) != null) throw new InvalidDataInputException(Constants.USER_EXISTS_EXCEPTION_MESSAGE);
        if(!user.isValidEmail()) throw new InvalidDataInputException(Constants.EMAIL_EXCEPTION_MESSAGE);
        if(!user.isValidPassword()) throw new InvalidDataInputException(Constants.PASSWORD_EXCEPTION_MESSAGE);
        
        user.setPassword(this.bCryptPasswordEncoder.encode(user.getPassword()));
        
        return userRepository.insert(user);
    }
    
    @Override 
    public User login(User u) {
        User user = userRepository.findByEmail(u.getEmail());
        
        if(user == null || !this.bCryptPasswordEncoder.matches(u.getPassword(), user.getPassword())) {
            throw new InvalidDataInputException(Constants.INVALID_USER_LOGIN_MESSAGE);
        }
        
        System.out.println("the user " + user.toString());
        return user;
    }
    
    @Override
    public UserDetails loadUserByUsername(String string) throws UsernameNotFoundException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
