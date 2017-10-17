package org.postgetman.schedule.app.controller;

import org.postgetman.schedule.app.domain.user.User;
import org.postgetman.schedule.app.service.UserService;
import org.postgetman.schedule.app.service.impl.UserServiceImpl;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    private UserService service = new UserServiceImpl();

    @GetMapping(value = "/users")
    public List<User> findAll(){
        return service.findAll();
    }


}
