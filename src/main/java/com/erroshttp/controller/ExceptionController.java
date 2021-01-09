package com.erroshttp.controller;

import com.erroshttp.dto.ErrorHttpRetornoDto;
import com.erroshttp.enums.HttpCodes;
import com.erroshttp.exception.ExceptionGenericHttp;
import com.erroshttp.exception.InternalServerErrorException;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@AllArgsConstructor
@ControllerAdvice
public class ExceptionController extends RuntimeException {


    //ExceptionGenericHttp exception, HttpCodes http, String message, HttpStatus status)
    @ExceptionHandler(ExceptionGenericHttp.class)
    public ResponseEntity<ErrorHttpRetornoDto> handler(ExceptionGenericHttp exception){

        ErrorHttpRetornoDto errorHttp = new ErrorHttpRetornoDto();
        errorHttp.setError("message");
        errorHttp.setHttpCode("404");
        errorHttp.setHttpNome("BAD REQUESTR");

        return new ResponseEntity<ErrorHttpRetornoDto>(errorHttp,HttpStatus.BAD_REQUEST);
    }




    @ExceptionHandler(InternalServerErrorException.class)
    public ResponseEntity<ErrorHttpRetornoDto>  handler(){
        ErrorHttpRetornoDto errorHttp = new ErrorHttpRetornoDto();
        errorHttp.setError("");
        errorHttp.setHttpCode("500");
        errorHttp.setHttpNome("Internal Server Error");
        return new ResponseEntity<ErrorHttpRetornoDto>(errorHttp,HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
