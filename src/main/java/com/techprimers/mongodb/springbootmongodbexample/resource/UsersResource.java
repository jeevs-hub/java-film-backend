package com.techprimers.mongodb.springbootmongodbexample.resource;

import com.techprimers.model.UserRegisterModel;
import com.techprimers.mongodb.springbootmongodbexample.document.User;
import com.techprimers.mongodb.springbootmongodbexample.repository.UserRepository;
import com.techprimers.mongodb.springbootmongodbexample.service.UserServiceImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/user")
public class UsersResource {

    private UserServiceImpl userService; 
        
    public UsersResource(UserRepository userRepository) {
        this.userService = new UserServiceImpl(userRepository);
    }

    @GetMapping("/all")
    public List<User> getAll() {
        System.out.println("reaches here ");
        return userService.listAll();
    }
    
    @PostMapping("/register")
    public String register(@RequestBody UserRegisterModel user) {
        System.out.println("reaches here " + user.toString());
        userService.register(user);
        return "test";
    }
    
    @PostMapping("/test")
    public String test(@RequestBody User test) {
        System.out.println("reaches here " + test);
        return "test";
    }
}
