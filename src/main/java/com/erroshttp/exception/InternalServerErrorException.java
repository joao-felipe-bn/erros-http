package com.erroshttp.exception;

public class InternalServerErrorException extends RuntimeException{

    private final String message;


    public InternalServerErrorException(Exception err){
        super(err);
        this.message= err.getMessage();
    }

    public InternalServerErrorException(String err){
        super(err);
        this.message= err;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
