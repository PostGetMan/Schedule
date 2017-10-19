package org.postgetman.schedule.app.domain.service;

import org.junit.Before;
import org.junit.Test;
import org.postgetman.schedule.app.domain.schedule.Record;
import org.postgetman.schedule.app.domain.schedule.Schedule;
import org.postgetman.schedule.app.service.RecordService;
import org.postgetman.schedule.app.service.ScheduleService;
import org.postgetman.schedule.app.service.impl.RecordServiceImpl;
import org.postgetman.schedule.app.service.impl.ScheduleServiceImpl;

import java.time.LocalTime;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class RecordServiceImplTest {

    private ScheduleService scheduleService;
    private RecordService service;

    @Before
    public void setup(){
        service = new RecordServiceImpl();
        scheduleService = new ScheduleServiceImpl();
    }

    @Test
    public void testAddRecordSuccess(){
        Schedule schedule = new Schedule("2017-09-08","09:00","17:00");
        Schedule schedule1 = new Schedule("2017-09-10","09:00","17:00");

        scheduleService.createSchedule(schedule);
        scheduleService.createSchedule(schedule1);

        Record record = new Record("2017-09-10", LocalTime.of(10,00));

        assertTrue(!scheduleService.findAll().isEmpty());
        assertEquals(scheduleService.findByDate(record.getDate()),schedule1);


    }
}
