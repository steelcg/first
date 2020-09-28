package com.example.first.controller;

import com.example.first.bean.ApiReturn;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ResponseBody
    @ResponseStatus(HttpStatus.OK)
    @ExceptionHandler(Exception.class)
    public <T>ApiReturn<T> handleException(Exception ex) {
        return ApiReturn.fail(ex.getMessage(), -1);
    }

    @ResponseBody
    @ResponseStatus(HttpStatus.OK)
    @ExceptionHandler(Throwable.class)
    public <T>ApiReturn<T> handleThrowable(Throwable ex) {
        return ApiReturn.fail(ex.getMessage(), -2);
    }
}
