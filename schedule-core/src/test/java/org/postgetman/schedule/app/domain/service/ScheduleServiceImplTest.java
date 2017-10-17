package org.postgetman.schedule.app.domain.service;

import org.junit.Before;
import org.junit.Test;
import org.postgetman.schedule.app.domain.schedule.Schedule;
import org.postgetman.schedule.app.service.ScheduleService;
import org.postgetman.schedule.app.service.impl.ScheduleServiceImpl;

import java.time.LocalTime;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ScheduleServiceImplTest {

    private ScheduleService service;

    @Before
    public void setup(){
        service = new ScheduleServiceImpl();
    }

    @Test
    public void testParseStringInTimeAndDateSuccess(){
        Schedule schedule = new Schedule("1996-07-28","16:30","17:30");

        assertEquals(schedule.getDate().getYear(),1996);
        assertEquals(schedule.getTimeFrom().getMinute(),30);
    }

    @Test
    public void testAddAndFindAllScheduleSucess(){
        Schedule schedule = new Schedule("2017-08-15","17:30","18:30");

        service.createSchedule(schedule);

        assertTrue(!service.findAll().isEmpty());
    }

    @Test
    public void testFindByDateSuccess(){
        Schedule schedule = new Schedule("1997-08-28","16:35","17:30");
        Schedule schedule1 = new Schedule("1997-08-28","17:35","18:30");

        service.createSchedule(schedule);
        service.createSchedule(schedule1);

        List<Schedule> schedule2 = service.findByDate("1997-08-28");

        assertEquals(schedule2.get(0),schedule);
        assertEquals(schedule2.get(0).getTimeFrom(),LocalTime.of(16,35));
        assertEquals(service.findByDate("1997-08-28").size(),2);
    }

}
