package com.aledev.votacaoservice.exception;

import org.springframework.context.MessageSource;
import org.springframework.http.HttpStatus;

public class SessionNotFoundException extends BusinessException {

    private static final long serialVersionUID = 5553707156721755355L;

    public SessionNotFoundException(MessageSource messageSource) {
        super("session-6", HttpStatus.NOT_FOUND, messageSource);
    }
}
