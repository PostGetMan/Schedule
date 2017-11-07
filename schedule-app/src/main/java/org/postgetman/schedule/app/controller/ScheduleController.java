package org.postgetman.schedule.app.controller;

import org.postgetman.schedule.app.service.ScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ScheduleController extends BaseController{

    @Autowired
    private ScheduleService service;

    @RequestMapping(value = "/admin/schedule",method = RequestMethod.GET)
    public String displaySchedule(Model model){
        model.addAttribute("admin_schedule",service.findAll());

        return "schedule";
    }






}
