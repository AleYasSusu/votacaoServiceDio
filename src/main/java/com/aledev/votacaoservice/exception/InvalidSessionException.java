package com.aledev.votacaoservice.exception;

import org.springframework.context.MessageSource;
import org.springframework.http.HttpStatus;

public class InvalidSessionException extends BusinessException {

    private static final long serialVersionUID = 5553707156721755355L;

    public InvalidSessionException(MessageSource messageSource) {
        super("sessao-8", HttpStatus.BAD_REQUEST, messageSource);
    }
}
