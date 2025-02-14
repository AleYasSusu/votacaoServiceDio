package com.aledev.votacaoservice.exception;

import org.springframework.context.MessageSource;
import org.springframework.http.HttpStatus;

public class SessionTimeOutException extends BusinessException {

    private static final long serialVersionUID = 5553707156721755355L;

    public SessionTimeOutException(MessageSource messageSource) {
        super("session-7", HttpStatus.REQUEST_TIMEOUT, messageSource);
    }
}
