package com.techprimers.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class InvalidDataInputException extends RuntimeException {
       
    public InvalidDataInputException(String message) {
        super(message);
    }
    
}
