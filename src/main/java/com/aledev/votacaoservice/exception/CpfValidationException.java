package com.aledev.votacaoservice.exception;

import org.springframework.context.MessageSource;
import org.springframework.http.HttpStatus;

public class CpfValidationException extends BusinessException {

    private static final long serialVersionUID = 5553707156721755355L;

    public CpfValidationException(MessageSource messageSource) {
        super("validacao-cpf-unable", HttpStatus.UNAUTHORIZED, messageSource);
    }
}
