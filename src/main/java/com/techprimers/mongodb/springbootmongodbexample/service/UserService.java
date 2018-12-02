/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.techprimers.mongodb.springbootmongodbexample.service;
import com.techprimers.mongodb.springbootmongodbexample.document.User;

import java.util.List;

/**
 *
 * @author Jeevan
 */
public interface UserService {
    List<User> listAll();
    String register(String user);
//    User getById();
//    User update();
//    void delete(String id);
}
