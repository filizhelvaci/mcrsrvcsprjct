package com.flz.exception;

import lombok.Getter;

@Getter
public class ServiceUserProfileException extends RuntimeException{

    private final ErrorType type;

    public ServiceUserProfileException(ErrorType type) {
        super(type.getMessage());
        this.type = type;
    }

    public ServiceUserProfileException(ErrorType type, String message) {
        super(message);
        this.type = type;
    }
}
