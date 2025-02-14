package com.aledev.votacaoservice.exception;

import org.springframework.context.MessageSource;
import org.springframework.http.HttpStatus;

public class VoteNotFoundException extends BusinessException {

    private static final long serialVersionUID = 5553707156721755355L;

    public VoteNotFoundException(MessageSource messageSource) {
        super("voto-6", HttpStatus.BAD_REQUEST, messageSource);
    }
}
