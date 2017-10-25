package org.postgetman.schedule.app.controller;

import org.postgetman.schedule.app.domain.user.User;
import org.postgetman.schedule.app.dto.UserDTO;
import org.postgetman.schedule.app.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController extends BaseController{

    @Autowired
    private UserService service;

    @GetMapping
    public List<User> findAll(){
        return service.findAll();
    }

    @PostMapping
    public void save(@RequestBody UserDTO userDTO){
        service.saveUser(convert(userDTO,User.class));
    }

    @GetMapping("/{id}")
    public User findOne(@PathVariable(name = "id") final Long id){
        return service.findOne(id);
    }

    @GetMapping("/email/{email}")
    public User findByEmail(@PathVariable("email") final String email){
        return service.findByEmail(email);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteUser(@PathVariable("id") Long id){
        service.deleteUser(id);
    }




}
