package com.aledev.votacaoservice.exception;

import org.springframework.context.MessageSource;
import org.springframework.http.HttpStatus;

public class PautaNotFoundException extends BusinessException {

    private static final long serialVersionUID = 5553707156721755355L;

    public PautaNotFoundException(MessageSource messageSource) {
        super("pauta-6", HttpStatus.NOT_FOUND, messageSource);
    }
}

