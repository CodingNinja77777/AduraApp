package com.meghaSolution.AduraApp.Exceptions;

public class CustomerIDNotFoundException extends RuntimeException{
    private  String message;

    public CustomerIDNotFoundException(String message) {
        super(message);
        this.message = message;
    }
}
