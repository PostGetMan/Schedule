package org.postgetman.schedule.app.exception;

public class UserAlreadyExist extends BaseException{

    public UserAlreadyExist(String mesaage, Throwable cause) {
        super(mesaage, cause);
    }

    public UserAlreadyExist(String message) {
        super(message);
    }
}
