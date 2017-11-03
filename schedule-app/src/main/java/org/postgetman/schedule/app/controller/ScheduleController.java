package org.postgetman.schedule.app.controller;

import org.postgetman.schedule.app.domain.schedule.Schedule;
import org.postgetman.schedule.app.dto.ScheduleDTO;
import org.postgetman.schedule.app.service.ScheduleService;
import org.postgetman.schedule.app.util.ConvertUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/schedule")
public class ScheduleController extends BaseController{

    @Autowired
    private ScheduleService service;

    @GetMapping
    public List<Schedule> findAll(){
        return service.findAll();
    }

    @PostMapping
    public void creteSchedule(@RequestBody ScheduleDTO scheduleDTO){
        service.createSchedule(ConvertUtil.convertSchedule(scheduleDTO));
    }

    @GetMapping("/{date}")
    public Schedule findByDate(@PathVariable("date") final String date){
        return service.findByDate(date);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable ("id") final Long id){
        service.removeSchedule(id);
    }




}
