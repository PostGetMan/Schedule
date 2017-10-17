package org.postgetman.schedule.app.service;

import org.postgetman.schedule.app.domain.schedule.Schedule;

import java.time.LocalDate;
import java.util.List;

public interface ScheduleService {

    List<Schedule> findAll();

    List<Schedule> findByDate(final String date);

    Schedule findOne(Long id);

//    List<Schedule> findByDate(LocalDate date);

    void createSchedule(Schedule schedule);

    void removeSchedule(Long id);

    void removeSchedule(LocalDate date);
}
