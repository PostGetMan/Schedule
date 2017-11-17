package org.postgetman.schedule.app.controller;

import org.postgetman.schedule.app.service.ScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AdminController extends BaseController{

    @Autowired
    private ScheduleService scheduleService;

    @RequestMapping(value = "/admin",method = RequestMethod.GET)
    public String getShedule(Model model){

        model.addAttribute("admin_schedule",scheduleService.findAll());
        return "admin_page";
    }
}
