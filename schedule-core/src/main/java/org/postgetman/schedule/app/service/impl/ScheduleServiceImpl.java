package org.postgetman.schedule.app.service.impl;

import org.postgetman.schedule.app.domain.schedule.Schedule;
import org.postgetman.schedule.app.domain.util.DateTimeUtil;
import org.postgetman.schedule.app.exception.ScheduleNotFoundException;
import org.postgetman.schedule.app.service.ScheduleService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ScheduleServiceImpl implements ScheduleService{

    private static final Logger LOGGER = LoggerFactory.getLogger(ScheduleServiceImpl.class);

    private List<Schedule> timeTable;

    public ScheduleServiceImpl(){
        timeTable = new ArrayList<>();
    }

    @Override
    public List<Schedule> findAll() {
        return timeTable;
    }

    @Override
    public Schedule findOne(Long id) {
        for(Schedule schedule : timeTable){
            if(schedule.getId().equals(id)){
                return schedule;
            }
        }

        LOGGER.error("No schedule with id: {}",id);
        return null;
    }

    @Override
    public Schedule findByDate(LocalDate date) {

        for(Schedule schedule : timeTable){
            if (schedule.getDate().equals(date)){
                return schedule;
            }
        }

        LOGGER.error("No schedule on this date: {}",date);
        throw new ScheduleNotFoundException("Schedule does not exist");
    }

    @Override
    public Schedule findByDate(String date) {

        for(Schedule schedule : timeTable){
            if(schedule.getDate().getYear() == DateTimeUtil.getYear(date) &&
                    schedule.getDate().getMonthValue() == DateTimeUtil.getMonth(date)
                    && schedule.getDate().getDayOfMonth() == DateTimeUtil.getDay(date)){
                return schedule;
            }
        }

        LOGGER.error("No schedule on this date: {}",date);
        throw new ScheduleNotFoundException("Schedule does not exist");
    }

    @Override
    public void createSchedule(Schedule schedule) {
        if(!timeTable.contains(schedule)){
            timeTable.add(schedule);
        }
    }

    @Override
    public void updateSchedule(Schedule schedule) {

    }

    @Override
    public void removeSchedule(Long id) {
        timeTable.removeIf(schedule -> schedule.getId().equals(id));
    }


}
