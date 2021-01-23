package com.erroshttp.exception;

import lombok.Data;

@Data
public class ExceptionBadRequest extends RuntimeException {

    public ExceptionBadRequest() {
        super();
    }

    public ExceptionBadRequest(String description, String httpStatus) {
        super();
        this.description = description;
        this.httpStatus = httpStatus;
    }


    private String description;
    private String httpStatus;

}
