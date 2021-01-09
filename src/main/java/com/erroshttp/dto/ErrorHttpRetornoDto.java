package com.erroshttp.dto;

import lombok.Data;


@Data
public class ErrorHttpRetornoDto {

    private String httpCode;
    private String HttpNome;
    private String error;

}
