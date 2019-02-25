package com.raccoon.training.rest_practice.exception;

public class ConferenceNotFoundException extends RuntimeException {

    public ConferenceNotFoundException(Long id) {
        super("Could not find conference " + id);
    }
}