package com.aledev.votacaoservice.exception;

import org.springframework.context.MessageSource;
import org.springframework.http.HttpStatus;

public class InvalidCpfException extends BusinessException {

    private static final long serialVersionUID = 5553707156721755355L;

    public InvalidCpfException(MessageSource messageSource) {
        super("validacao-cpf", HttpStatus.BAD_REQUEST, messageSource);
    }
}
