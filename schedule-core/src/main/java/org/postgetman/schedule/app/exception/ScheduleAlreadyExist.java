package org.postgetman.schedule.app.exception;

public class ScheduleAlreadyExist extends BaseException{

    public ScheduleAlreadyExist(String mesaage, Throwable cause) {
        super(mesaage, cause);
    }

    public ScheduleAlreadyExist(String message) {
        super(message);
    }
}
