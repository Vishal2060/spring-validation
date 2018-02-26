package com.vishal.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.validation.BindException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.validation.ConstraintViolationException;
import java.util.List;
import java.util.stream.Collectors;

@RestControllerAdvice
public class BookControllerAdvice {

    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseStatus(HttpStatus.CONFLICT)
    public List<String> ConstraintViolationExceptionHandler(MethodArgumentNotValidException e) {
        System.out.println("1");
        System.out.println(e);

        List<String> list =e.getBindingResult().getAllErrors().stream().map(x->x.getDefaultMessage()).collect(Collectors.toList());
        System.out.println("2");
        return list;
    }
}
