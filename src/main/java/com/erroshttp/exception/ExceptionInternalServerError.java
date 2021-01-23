package com.erroshttp.exception;

import lombok.Data;

@Data
public class ExceptionInternalServerError extends RuntimeException{

    private String message;

    private String description;
    private String httpStatus;

    public ExceptionInternalServerError(String description, String httpStatus){
        super();
        this.description = description;
        this.httpStatus = httpStatus;
    }


    public ExceptionInternalServerError(Exception err){
        super(err);
        this.message= err.getMessage();
    }

    public ExceptionInternalServerError(String err){
        super(err);
        this.message= err;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
