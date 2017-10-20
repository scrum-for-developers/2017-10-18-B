package de.codecentric.psd.worblehat.domain;

public class IsbnTitleMismatchException extends Exception {
    private static final long serialVersionUID = 4321L;

    public IsbnTitleMismatchException(String message) {
        super(message);
    }

}
