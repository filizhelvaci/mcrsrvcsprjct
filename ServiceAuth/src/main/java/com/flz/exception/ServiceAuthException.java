package com.flz.exception;

import lombok.Getter;

@Getter
public class ServiceAuthException extends RuntimeException{

    private final ErrorType type;

    public ServiceAuthException(ErrorType type) {
        super(type.getMessage());
        this.type = type;
    }

    public ServiceAuthException(ErrorType type, String message) {
        super(message);
        this.type = type;
    }
}
