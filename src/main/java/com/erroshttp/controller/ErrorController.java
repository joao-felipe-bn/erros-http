package com.erroshttp.controller;

import com.erroshttp.business.TrataExcecaoBusiness;
import com.erroshttp.dto.ErrorHttpRetornoDto;
import io.swagger.annotations.Api;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@Api(value = "ERROS HTTP")
public class ErrorController {

    private final TrataExcecaoBusiness trataExcecao;

    @GetMapping()
    public ResponseEntity<ErrorHttpRetornoDto> error100(@RequestParam ("httpCode") Integer httpCode) {
        return new ResponseEntity<>(trataExcecao.tratarExcecao(httpCode.toString()),HttpStatus.OK);
    }


}
