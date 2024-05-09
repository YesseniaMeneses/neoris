package com.neoris.movementsservice.exception;

/**
 * Exceptions for duplicated values.
 */
public class ResourceAlreadyExistsException extends RuntimeException{
    public ResourceAlreadyExistsException() {
    }
    public ResourceAlreadyExistsException(String message) {
        super(message);
    }
}
