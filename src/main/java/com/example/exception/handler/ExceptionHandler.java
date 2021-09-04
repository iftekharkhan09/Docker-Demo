package com.example.exception.handler;

import com.example.exception.UserNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;

import javax.servlet.http.HttpServletRequest;

@ControllerAdvice
public class ExceptionHandler extends RuntimeException {
    @org.springframework.web.bind.annotation.ExceptionHandler(UserNotFoundException.class)
    public ResponseEntity handleException(HttpServletRequest request, UserNotFoundException exception){
        System.out.println(request.getQueryString());
        return new ResponseEntity(exception, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
