package org.postgetman.schedule.app.exception;

public class AlreadyExistException extends BaseException{

    public AlreadyExistException(String mesaage, Throwable cause) {
        super(mesaage, cause);
    }

    public AlreadyExistException(String message) {
        super(message);
    }
}
