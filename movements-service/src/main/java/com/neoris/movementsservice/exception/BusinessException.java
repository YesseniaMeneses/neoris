package com.neoris.movementsservice.exception;

/**
 * Exceptions for business rules.
 */
public class BusinessException extends RuntimeException{
    public BusinessException() {
    }
    public BusinessException(String message) {
        super(message);
    }
}
