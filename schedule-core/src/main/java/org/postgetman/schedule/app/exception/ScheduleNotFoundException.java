package org.postgetman.schedule.app.exception;

public class ScheduleNotFoundException extends BaseException{

    public ScheduleNotFoundException(String mesaage, Throwable cause) {
        super(mesaage, cause);
    }

    public ScheduleNotFoundException(String message) {
        super(message);
    }
}
