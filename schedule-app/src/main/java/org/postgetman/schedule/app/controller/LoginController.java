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

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

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
    public String loginProcess(@ModelAttribute("login") LoginDTO loginDTO, Model model,
                               HttpServletRequest request){

        User user = userService.validateUser(loginDTO);

        if(user != null && user.getRole().getName().equals("user")){
            HttpSession session = request.getSession();
            session.setAttribute("fullname",user.getFullname());

            model.addAttribute("fullname",session.getAttribute("fullname"));

            return "user/user_page";
        }else if(user != null && user.getRole().getName().equals("admin")){
            return "redirect:/admin";
        }

        return "redirect:/deny";
    }

    @RequestMapping(value = "/logout",method = RequestMethod.GET)
    public String logOut(HttpServletRequest request){
        request.getSession().invalidate();

        return "redirect:/login";
    }


}
