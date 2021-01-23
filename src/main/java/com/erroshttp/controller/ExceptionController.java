package com.erroshttp.controller;

import com.erroshttp.dto.ErrorHttpRetornoDto;
import com.erroshttp.exception.ExceptionBadRequest;
import com.erroshttp.exception.ExceptionNotFound;
import com.erroshttp.exception.ExceptionInternalServerError;
import com.erroshttp.exception.ExceptionUnathorezed;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@AllArgsConstructor
@ControllerAdvice
public class ExceptionController extends RuntimeException {

    @ExceptionHandler(ExceptionNotFound.class)
    public ResponseEntity<ErrorHttpRetornoDto> handler(ExceptionNotFound exception){
        ErrorHttpRetornoDto errorHttp = new ErrorHttpRetornoDto();
        errorHttp.setError("Recurso não encontrado");
        errorHttp.setHttpCode(exception.getHttpStatus());
        errorHttp.setHttpNome(exception.getDescription());

        return new ResponseEntity<ErrorHttpRetornoDto>(errorHttp,HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(ExceptionInternalServerError.class)
    public ResponseEntity<ErrorHttpRetornoDto>  handler(ExceptionInternalServerError exception){
        ErrorHttpRetornoDto errorHttp = new ErrorHttpRetornoDto();
        errorHttp.setError("Erro interno no servidor");
        errorHttp.setHttpCode(exception.getHttpStatus());
        errorHttp.setHttpNome(exception.getDescription());

        return new ResponseEntity<ErrorHttpRetornoDto>(errorHttp,HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @ExceptionHandler(ExceptionUnathorezed.class)
    public ResponseEntity<ErrorHttpRetornoDto>  handler(ExceptionUnathorezed exception){
        ErrorHttpRetornoDto errorHttp = new ErrorHttpRetornoDto();
        errorHttp.setError("Não autorizado");
        errorHttp.setHttpCode(exception.getHttpStatus());
        errorHttp.setHttpNome(exception.getDescription());

        return new ResponseEntity<ErrorHttpRetornoDto>(errorHttp,HttpStatus.UNAUTHORIZED);
    }

    @ExceptionHandler(ExceptionBadRequest.class)
    public ResponseEntity<ErrorHttpRetornoDto>  handler(ExceptionBadRequest exception){
        ErrorHttpRetornoDto errorHttp = new ErrorHttpRetornoDto();
        errorHttp.setError("Requisição não aceita");
        errorHttp.setHttpCode(exception.getHttpStatus());
        errorHttp.setHttpNome(exception.getDescription());

        return new ResponseEntity<ErrorHttpRetornoDto>(errorHttp,HttpStatus.BAD_REQUEST);
    }

}

