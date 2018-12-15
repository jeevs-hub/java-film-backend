/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.techprimers.mongodb.springbootmongodbexample.service;
import com.techprimers.model.UserRegisterModel;
import com.techprimers.mongodb.springbootmongodbexample.document.User;

import java.util.List;
import org.springframework.security.core.userdetails.UserDetailsService;

/**
 *
 * @author Jeevan
 */
public interface UserService extends UserDetailsService {
    List<User> listAll();
    User register(User user);
    User login(User user);
//    User getById();
//    User update();
//    void delete(String id);
}
