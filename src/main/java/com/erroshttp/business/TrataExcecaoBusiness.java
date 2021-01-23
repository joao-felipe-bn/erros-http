package com.erroshttp.business;

import com.erroshttp.dto.ErrorHttpRetornoDto;
import com.erroshttp.enums.HttpCodes;
import com.erroshttp.exception.ExceptionBadRequest;
import com.erroshttp.exception.ExceptionNotFound;
import com.erroshttp.exception.ExceptionInternalServerError;
import com.erroshttp.exception.ExceptionUnathorezed;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class TrataExcecaoBusiness {

    public ErrorHttpRetornoDto tratarExcecao(String httpCode) {

        HttpCodes http = HttpCodes.findHttpByCode(httpCode);

        if (Objects.isNull(http)) {
            throw new ExceptionNotFound("NOT FOUND", "404");
        }

        switch (httpCode) {
            case "400":
                throw new ExceptionBadRequest("BAD REQUEST", "400");
            case "401":
                throw new ExceptionUnathorezed("UNAUTHORIZED","401");
            case "500":
                throw new ExceptionInternalServerError("INTERNAL SERVER ERROR","500");
            default:
        }

        return getSucessCreated();
    }

    private ErrorHttpRetornoDto getSucessCreated() {
        ErrorHttpRetornoDto retorno = new ErrorHttpRetornoDto();
        retorno.setError(null);
        retorno.setHttpNome("OK");
        retorno.setHttpCode("200");
        return retorno;
    }

}