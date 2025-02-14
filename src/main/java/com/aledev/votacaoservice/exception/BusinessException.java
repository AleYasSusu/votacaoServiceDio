package com.aledev.votacaoservice.exception;
import lombok.Getter;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.http.HttpStatus;

@Getter
public class BusinessException extends RuntimeException {

    private static final long serialVersionUID = 2329295674665615129L;

    private final String code;
    private final HttpStatus status;
    private final String message;

    public BusinessException(String code, HttpStatus status, MessageSource messageSource) {
        super(code); // Opcional, mantém o código como a mensagem padrão da exceção
        this.code = code;
        this.status = status;
        this.message = messageSource.getMessage(code, null, LocaleContextHolder.getLocale());
    }
}
