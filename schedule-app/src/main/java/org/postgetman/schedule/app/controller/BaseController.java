package org.postgetman.schedule.app.controller;

import org.dozer.Mapper;
import org.postgetman.schedule.app.dto.ErrorDTO;
import org.postgetman.schedule.app.exception.ScheduleAlreadyExist;
import org.postgetman.schedule.app.exception.ScheduleNotFoundException;
import org.postgetman.schedule.app.exception.UserAlreadyExist;
import org.postgetman.schedule.app.exception.UserNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@Controller
public class BaseController {

    @Autowired
    public Mapper mapper;

    protected <T,R> R convert(T source, Class<R> resultClass) {
        return mapper.map(source,resultClass);
    }

    @ResponseStatus(value = HttpStatus.NOT_FOUND,reason = "No such user")
    @ExceptionHandler(UserNotFoundException.class)
    public ErrorDTO handleError(UserNotFoundException e){
        return new ErrorDTO("Exception has occured" + e.getMessage());
    }

    @ResponseStatus(value = HttpStatus.NOT_FOUND,reason = "Schedule does not exist")
    @ExceptionHandler(ScheduleNotFoundException.class)
    public ErrorDTO handleError(ScheduleNotFoundException e){
        return new ErrorDTO("Exception has occured" + e.getMessage());
    }

    @ResponseStatus(value = HttpStatus.CONFLICT,reason = "User already exist")
    @ExceptionHandler(UserAlreadyExist.class)
    public ErrorDTO handleError(UserAlreadyExist u){
        return new ErrorDTO("Exception has occured" + u.getMessage());
    }

    @ResponseStatus(value = HttpStatus.CONFLICT,reason = "Schedule already exist")
    @ExceptionHandler(ScheduleAlreadyExist.class)
    public ErrorDTO handleError(ScheduleAlreadyExist s){
        return new ErrorDTO("Exception has occured" + s.getMessage());
    }
}
