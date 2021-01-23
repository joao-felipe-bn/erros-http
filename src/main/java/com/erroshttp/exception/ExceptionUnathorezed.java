package com.erroshttp.exception;

import lombok.Data;

@Data
public class ExceptionUnathorezed extends RuntimeException {

    public ExceptionUnathorezed(){
        super();
    }

    public ExceptionUnathorezed(String description, String httpStatus){
        super();
        this.description = description;
        this.httpStatus = httpStatus;
    }

    private String description;
    private String httpStatus;
}
