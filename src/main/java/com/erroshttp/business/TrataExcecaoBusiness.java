package com.erroshttp.business;


import com.erroshttp.dto.ErrorHttpRetornoDto;
import com.erroshttp.enums.HttpCodes;
import com.erroshttp.exception.ExceptionGenericHttp;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

@Service
public class TrataExcecaoBusiness {

    public ErrorHttpRetornoDto tratarExcecao(String httpCode){

        HttpCodes http = HttpCodes.findHttpByCode(httpCode);


        throw new ExceptionGenericHttp();


//       ErrorHttpRetornoDto retorno = new ErrorHttpRetornoDto();
//       retorno.setError("Sucesso");
//       retorno.setHttpNome(HttpStatus.OK.toString());
//       retorno.setHttpCode(HttpStatus.OK.toString());

//       return retorno;
    }

}
