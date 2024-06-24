package org.lesson;

public class WronginputException extends Throwable {
    public WronginputException(String message, Exception cause) {
        super(message, cause);
    }
}