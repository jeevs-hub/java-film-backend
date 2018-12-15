package com.techprimers.model;

import com.techprimers.constants.Constants;
import java.util.regex.Pattern;

public class UserRegisterModel {
    
    private String email;
    private String password;
    
    public UserRegisterModel() {
        
    }
    
    public UserRegisterModel(String email, String password) {
        this.email = email;
        this.password = password;
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
    
    @Override()
    public String toString() {
        return String.format("the user email %s the users password %s ", email, password );
    }
}
