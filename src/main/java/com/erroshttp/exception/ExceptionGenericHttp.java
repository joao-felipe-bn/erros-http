package com.erroshttp.exception;

import lombok.Data;
import org.springframework.http.HttpStatus;
import org.springframework.web.client.HttpStatusCodeException;
                            //HttpStatusCodeException
public class ExceptionGenericHttp extends RuntimeException {

//    private final String description;
//    private final String httpStatus;

    public ExceptionGenericHttp(){
        super();
    }

//    public String getDescription() {
//        return description;
//    }
//    public String getHttpStatus() {
//        return httpStatus;
//    }
}
