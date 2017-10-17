package org.postgetman.schedule.app.controller;

import org.postgetman.schedule.app.domain.schedule.Schedule;
import org.postgetman.schedule.app.dto.ScheduleDTO;
import org.postgetman.schedule.app.service.ScheduleService;
import org.postgetman.schedule.app.service.impl.ScheduleServiceImpl;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/schedule")
public class ScheduleController extends BaseController{

    private ScheduleService service = new ScheduleServiceImpl();

    @GetMapping
    public List<Schedule> findAll(){
        return service.findAll();
    }

    @PostMapping
    public void creteSchedule(@RequestBody ScheduleDTO scheduleDTO){
        service.createSchedule(new Schedule(scheduleDTO.getDate(),scheduleDTO.getTimeFrom(),scheduleDTO.getTimeTo()));
    }

}
