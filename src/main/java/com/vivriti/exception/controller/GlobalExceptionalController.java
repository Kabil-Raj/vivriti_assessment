package com.vivriti.exception.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.vivriti.custom.exception.EmployeeNotFoundException;

@ControllerAdvice
public class GlobalExceptionalController extends ResponseEntityExceptionHandler{
    
    @ExceptionHandler(EmployeeNotFoundException.class)
    public ResponseEntity<Object> handleEmployeeNotFoundException() {
        return new ResponseEntity<Object>("Employee not found",HttpStatus.NOT_FOUND);
    }
}
