package org.postgetman.schedule.app.controller;

import org.dozer.Mapper;
import org.postgetman.schedule.app.dto.ErrorDTO;
import org.postgetman.schedule.app.exception.AlreadyExistException;
import org.postgetman.schedule.app.exception.NotFoundException;
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

    @ResponseStatus(value = HttpStatus.NOT_FOUND,reason = "Resource does not exist or access denied")
    @ExceptionHandler(NotFoundException.class)
    public ErrorDTO handleError(NotFoundException e){
        return new ErrorDTO("Exception has occured" + e.getMessage());
    }

    @ResponseStatus(value = HttpStatus.CONFLICT,reason = "Resource already exist")
    @ExceptionHandler(AlreadyExistException.class)
    public ErrorDTO handleError(AlreadyExistException s){
        return new ErrorDTO("Exception has occured" + s.getMessage());
    }
}
