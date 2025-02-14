package com.aledev.votacaoservice.exception;

import org.springframework.context.MessageSource;
import org.springframework.http.HttpStatus;

public class UnableCpfException extends BusinessException {

    private static final long serialVersionUID = 5553707156721755355L;

    public UnableCpfException(MessageSource messageSource) {

        super("validacao-cpf-unable", HttpStatus.UNAUTHORIZED, messageSource);
    }


}
