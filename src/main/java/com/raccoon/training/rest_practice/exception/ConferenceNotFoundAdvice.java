package com.raccoon.training.rest_practice.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class ConferenceNotFoundAdvice {
    
    @ResponseBody
    @ExceptionHandler(ConferenceNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    String conferenceNotFoundHandler(ConferenceNotFoundException ex){
        return ex.getMessage();
    }
}
