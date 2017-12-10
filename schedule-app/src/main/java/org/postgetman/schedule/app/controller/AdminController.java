package org.postgetman.schedule.app.controller;

import org.postgetman.schedule.app.dto.ScheduleDTO;
import org.postgetman.schedule.app.service.ScheduleService;
import org.postgetman.schedule.app.util.ConvertUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AdminController extends BaseController{

    private ScheduleService scheduleService;

    @Autowired
    public AdminController(ScheduleService scheduleService){
        this.scheduleService = scheduleService;
    }

    @RequestMapping(value = "/admin",method = RequestMethod.GET)
    public String getShedule(Model model){

        model.addAttribute("admin_schedule",scheduleService.findAll());
        return "admin_page";
    }

    @RequestMapping(value = "/admin/create",method = RequestMethod.GET)
    public String createSchedule(Model model){
        model.addAttribute("schedule",new ScheduleDTO());

        return "create_schedule";
    }

    @RequestMapping(value = "/admin/create",method = RequestMethod.POST)
    public String submitSchedule(@ModelAttribute(value = "schedule") ScheduleDTO scheduleDTO,Model model){
        model.addAttribute(scheduleDTO);

        scheduleService.createSchedule(ConvertUtil.convertSchedule(scheduleDTO));

        return "redirect:/admin";
    }
}
