package com.mjc.school.service.exceptions;

public class NewsNotFoundException extends RuntimeException{
    public NewsNotFoundException(String message){
        super(message);
    }
}
