package com.techprimers.exception;

import com.techprimers.model.ErrorMessage;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;
import org.springframework.http.ResponseEntity;

@ControllerAdvice
@RestController
public class CustomizedResponseEntityExceptionHandler extends ResponseEntityExceptionHandler {

  @ExceptionHandler(InvalidDataInputException.class)
  public final ResponseEntity<ErrorMessage> handleUserNotFoundException(InvalidDataInputException ex, WebRequest request) {
    ErrorMessage errorDetails = new ErrorMessage(ex.getMessage(), 400);
    return new ResponseEntity<>(errorDetails, HttpStatus.NOT_FOUND);
  }
}
