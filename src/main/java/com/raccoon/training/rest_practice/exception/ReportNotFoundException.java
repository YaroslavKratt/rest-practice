package com.raccoon.training.rest_practice.exception;

public class ReportNotFoundException extends RuntimeException {

    public ReportNotFoundException(Long id) {super("Could not find report " + id);
    }
}
