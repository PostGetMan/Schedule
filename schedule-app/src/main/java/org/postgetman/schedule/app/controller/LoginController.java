package org.postgetman.schedule.app.controller;

import org.postgetman.schedule.app.domain.user.User;
import org.postgetman.schedule.app.dto.LoginDTO;
import org.postgetman.schedule.app.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController extends BaseController{

    private UserService userService;

    @Autowired
    public LoginController(UserService userService){
        this.userService = userService;
    }

    @RequestMapping(value = "/login",method = RequestMethod.GET)
    public String loginForm(Model model){

        model.addAttribute("login",new LoginDTO());
        return "signin";
    }

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public String loginProcess(@ModelAttribute("login") LoginDTO loginDTO,Model model){
        User user = userService.validateUser(loginDTO);

        if(user != null && user.getRole().getName().equals("user")){
            model.addAttribute("fullname",user.getFullName());

            return "user_page";
        }
        if(user != null && user.getRole().getName().equals("admin")){
            return "redirect:/admin";
        }

        return "redirect:/deny";

    }


}
