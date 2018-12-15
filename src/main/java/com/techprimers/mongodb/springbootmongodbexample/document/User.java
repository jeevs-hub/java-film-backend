package com.techprimers.mongodb.springbootmongodbexample.document;

import com.techprimers.constants.Constants;
import java.util.regex.Pattern;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class User {

    @Id
    private ObjectId id;
    private String firstName;
    private String lastName;
    private String email;
    private String password;

    public User() {
    }

    public User(String firstName, String lastName, String email, String password) {
        this.id = new ObjectId();
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password =  password;
    }

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    
    public String getLastName() {
        return lastName;
    }

    public void setLasName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public boolean isValidEmail() {
        return Pattern.compile(Constants.IS_VALID_EMAIL_REGEX).matcher(email).matches();
    }
    
    public boolean isValidPassword() {
        return Pattern.compile(Constants.IS_VALID_PWORD_REGEX).matcher(password).matches();
    }
    
    @Override
    public String toString() {
        return String.format("the user id is %s "
                + "the user first name is %s "
                + "the user last name is %s "
                + "the user password is %s "
                + "the user email is %s ",
                id, firstName, lastName, email, password);
    }
}
