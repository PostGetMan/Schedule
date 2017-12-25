package org.postgetman.schedule.app.controller;

import org.postgetman.schedule.app.service.ScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class UserController extends BaseController{

    private ScheduleService scheduleService;

    @Autowired
    public void setScheduleService(ScheduleService scheduleService){
        this.scheduleService = scheduleService;
    }

    @RequestMapping(value = "/user/appointment",method = RequestMethod.GET)
    public String appointment(Model model){
        model.addAttribute("schedules",scheduleService.findAll());

        return "user/appointment";
    }
}
