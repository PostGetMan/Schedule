package org.postgetman.schedule.app.util;

import org.postgetman.schedule.app.domain.schedule.Record;
import org.postgetman.schedule.app.domain.schedule.Schedule;
import org.postgetman.schedule.app.dto.RecordDTO;
import org.postgetman.schedule.app.dto.ScheduleDTO;

import java.time.LocalDate;
import java.time.LocalTime;

public class ConvertUtil {

    public static Record convertRecord(RecordDTO recordDTO){
        Record record = new Record();
        record.setDate(LocalDate.parse(recordDTO.getDate()));
        record.setTime(LocalTime.parse(recordDTO.getTime()));
        record.setComplaint(recordDTO.getComplaint());

        return record;
    }

    public static Schedule convertSchedule(ScheduleDTO scheduleDTO){
        Schedule schedule = new Schedule();
        schedule.setDate(LocalDate.parse(scheduleDTO.getDate()));
        schedule.setTimeFrom(LocalTime.parse(scheduleDTO.getTimeFrom()));
        schedule.setTimeTo(LocalTime.parse(scheduleDTO.getTimeTo()));

        return schedule;
    }
}
