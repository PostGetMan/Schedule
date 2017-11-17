package org.postgetman.schedule.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class FrontController extends BaseController{

    @RequestMapping(value = "/home",method = RequestMethod.GET)
    public String home(){
        return "index";
    }

    @RequestMapping(value = "/deny",method = RequestMethod.GET)
    public String deny(){
        return "deny";
    }

    @RequestMapping(value = "/success",method = RequestMethod.GET)
    public String success(){
        return "reg_success";
    }


}
