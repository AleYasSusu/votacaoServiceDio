package com.aledev.votacaoservice.exception;

import org.springframework.context.MessageSource;
import org.springframework.http.HttpStatus;

public class VoteAlreadyExistsException extends BusinessException {

    private static final long serialVersionUID = 5553707156721755355L;

    public VoteAlreadyExistsException(MessageSource messageSource) {
        super("voto-7", HttpStatus.ALREADY_REPORTED, messageSource);
    }
}
