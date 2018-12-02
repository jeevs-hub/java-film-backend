package com.techprimers.mongodb.springbootmongodbexample.config;

import com.techprimers.mongodb.springbootmongodbexample.document.User;
import com.techprimers.mongodb.springbootmongodbexample.repository.UserRepository;
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
//            userRepository.save(new User(1, "Peter", "Development", 3000L));
//            userRepository.save(new User(2, "Sam", "Operations", 2000L));
//        };
//    }

}
