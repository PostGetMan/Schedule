package org.postgetman.schedule.app.service.impl;

import org.postgetman.schedule.app.domain.schedule.Schedule;
import org.postgetman.schedule.app.service.ScheduleService;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ScheduleServiceImpl implements ScheduleService{

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
        return null;
    }

    @Override
    public List<Schedule> findByDate(String date) {
        List<Schedule> scheduleList = new ArrayList<>();

        String year = date.substring(0,4);
        String month = date.substring(5,7);
        String day = date.substring(8,date.length());

        for(Schedule schedule : timeTable){
            if(schedule.getDate().getYear() == Integer.parseInt(year) &&
                    schedule.getDate().getMonthValue() == Integer.parseInt(month)
                    && schedule.getDate().getDayOfMonth() == Integer.parseInt(day)){
                scheduleList.add(schedule);
            }
        }
        return scheduleList.size() > 0 ? scheduleList:null;
    }

    @Override
    public void createSchedule(Schedule schedule) {
        if(!timeTable.contains(schedule)){
            timeTable.add(schedule);
        }
    }

    @Override
    public void removeSchedule(Long id) {
        timeTable.removeIf(schedule -> schedule.getId().equals(id));
    }

    @Override
    public void removeSchedule(LocalDate date) {
        timeTable.removeIf(schedule -> schedule.getDate().equals(date));
    }
}
