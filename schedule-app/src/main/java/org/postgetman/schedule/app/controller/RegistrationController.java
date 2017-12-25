package org.postgetman.schedule.app.controller;

import org.postgetman.schedule.app.domain.user.User;
import org.postgetman.schedule.app.dto.UserDTO;
import org.postgetman.schedule.app.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class RegistrationController extends BaseController{

    private UserService userService;

    @Autowired
    public RegistrationController(UserService userService){
        this.userService = userService;
    }

    @RequestMapping(value = "/register",method = RequestMethod.GET)
    public String register(Model model){
        model.addAttribute("user",new UserDTO());

        return "user/register";
    }

    @RequestMapping(value = "/register",method = RequestMethod.POST)
    public String registerUser(@ModelAttribute(value = "user")UserDTO userDTO,Model model){
        model.addAttribute(userDTO);

        userService.saveUser(convert(userDTO,User.class));

        return "redirect:/success";
    }
}
