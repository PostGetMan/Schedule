package org.postgetman.schedule.app.service.impl;

import org.postgetman.schedule.app.domain.schedule.Schedule;
import org.postgetman.schedule.app.exception.ScheduleAlreadyExist;
import org.postgetman.schedule.app.exception.ScheduleNotFoundException;
import org.postgetman.schedule.app.repository.ScheduleRepository;
import org.postgetman.schedule.app.service.ScheduleService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class ScheduleServiceImpl implements ScheduleService{

    private static final Logger LOGGER = LoggerFactory.getLogger(ScheduleServiceImpl.class);

    @Autowired
    private ScheduleRepository scheduleRepository;

    public ScheduleServiceImpl(){
    }

    @Override
    public List<Schedule> findAll() {
        return scheduleRepository.findAll();
    }

    @Override
    public Schedule findOne(Long id) {
        for(Schedule schedule : scheduleRepository.findAll()){
            if(schedule.getId().equals(id)){
                return schedule;
            }
        }

        LOGGER.error("No schedule with id: {}",id);
        throw new ScheduleNotFoundException("Schedule does not exist");
    }

    @Override
    public Schedule findByDate(LocalDate date) {

        for(Schedule schedule : scheduleRepository.findAll()){
            if (schedule.getDate().equals(date)){
                return schedule;
            }
        }

        LOGGER.error("No schedule on this date: {}",date);
        throw new ScheduleNotFoundException("Schedule does not exist");
    }

    @Override
    public Schedule findByDate(String date) {

        for(Schedule schedule : scheduleRepository.findAll()){
            if(schedule.getDate().equals(LocalDate.parse(date))){
                return schedule;
            }
        }

        LOGGER.error("No schedule on this date: {}",date);
        throw new ScheduleNotFoundException("Schedule does not exist");
    }

    @Override
    public void createSchedule(Schedule schedule) {
        if(!isExist(schedule)){
            scheduleRepository.save(schedule);
        }
    }

    @Override
    public void updateSchedule(Long id,Schedule schedule) {

    }

    @Override
    public void removeSchedule(Long id) {
        if(findOne(id) != null){
            scheduleRepository.deleteById(id);
        }
        LOGGER.error("No schedule with id: {}",id);
        throw new ScheduleNotFoundException("Schedule does not exist");
    }

    @Override
    public boolean isExist(Schedule schedule) {
        for(Schedule s : scheduleRepository.findAll()){
            if(s.getDate().equals(schedule.getDate())){
                LOGGER.error("Schedule already exist");
                throw new ScheduleAlreadyExist("Schedule already exist");
            }
        }

        return false;
    }


}
