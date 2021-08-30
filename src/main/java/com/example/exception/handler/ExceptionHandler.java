package com.example.exception.handler;

import com.example.exception.UserNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;

import javax.servlet.http.HttpServletRequest;

@ControllerAdvice
public class ExceptionHandler extends RuntimeException {
    @org.springframework.web.bind.annotation.ExceptionHandler(UserNotFoundException.class)
    public ResponseEntity<String> handleException(HttpServletRequest request, UserNotFoundException exception){
        System.out.println("Exception Caught...");
        System.out.println(exception.getMessage());
        System.out.println(request.getQueryString());
        return ResponseEntity.internalServerError().body("User not found");
    }
}
