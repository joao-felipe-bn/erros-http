package com.erroshttp.exception;

import lombok.Data;
import org.springframework.http.HttpStatus;
import org.springframework.web.client.HttpStatusCodeException;

@Data
public class ExceptionNotFound extends RuntimeException {

    public ExceptionNotFound() {
        super();
    }

    public ExceptionNotFound(String description, String httpStatus) {
        super();
        this.description = description;
        this.httpStatus = httpStatus;
    }


    private String description;
    private String httpStatus;

}
