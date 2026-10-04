package com.hitms.lms;

/**
 * Thrown when a requested book has no copies available.
 */
public class BookUnavailableException extends Exception {

    private static final long serialVersionUID = 1L;

    /**
     * Creates the exception with a message.
     *
     * @param message the detail message
     */
    public BookUnavailableException(String message) {
        super(message);
    }
}
