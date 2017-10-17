package org.postgetman.schedule.app.exception;

public class UserNotFoundException extends BaseException{

    public UserNotFoundException(String mesaage, Throwable cause) {
        super(mesaage, cause);
    }

    public UserNotFoundException(String message) {
        super(message);
    }
}
