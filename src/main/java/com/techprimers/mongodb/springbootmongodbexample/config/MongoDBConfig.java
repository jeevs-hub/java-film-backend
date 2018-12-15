package com.techprimers.mongodb.springbootmongodbexample.config;

import com.techprimers.mongodb.springbootmongodbexample.document.User;
import com.techprimers.mongodb.springbootmongodbexample.repository.UserRepository;
import org.bson.types.ObjectId;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@EnableMongoRepositories(basePackageClasses = UserRepository.class)
@Configuration
public class MongoDBConfig {
    
//    @Bean
//    CommandLineRunner commandLineRunner(UserRepository userRepository) {
//        return strings -> {
//            userRepository.save(new User("Peter", "jsg17@hotmail.co.uk", "test"));
//            userRepository.save(new User("Sam", "test@test.co.uk", "newtest"));
//        };
//    }

}
