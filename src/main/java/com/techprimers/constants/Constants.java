/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.techprimers.constants;

/**
 *
 * @author Jeevan
 */
public class Constants {
    public static final String IS_VALID_EMAIL_REGEX = ".+@.+\\.[a-z]+";
    public static final String EMAIL_EXCEPTION_MESSAGE = "Invalid email address. Please use the following format, test@test.com or test.test@test.co.uk";
    
    public static final String IS_VALID_PWORD_REGEX = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)[a-zA-Z\\d]{6,}$";
    public static final String PASSWORD_EXCEPTION_MESSAGE = "Invalid password. Must contain at least one lower case letter, one capital letter, one number and be six or more digits";

}
