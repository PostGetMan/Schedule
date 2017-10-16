package org.postgetman.schedule.app.domain;

import org.junit.Before;
import org.junit.Test;
import org.postgetman.schedule.app.domain.schedule.Record;
import org.postgetman.schedule.app.domain.schedule.Schedule;
import org.postgetman.schedule.app.domain.user.User;

import java.time.LocalTime;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ScheduleTest {

    private Schedule schedule;

    @Before
    public void setup(){
        schedule = new Schedule(LocalTime.of(12,30),LocalTime.of(14,25));
    }

    @Test
    public void testAddRecordSuccess(){
        Record record = new Record(new User("Papa","228"),LocalTime.of(14,15));

        schedule.addRecord(record);

        assertTrue(!schedule.getRecords().isEmpty());
    }

    @Test
    public void testEraseRecord(){
        Record record = new Record(new User("Miwa","229"),LocalTime.of(15,34));

        schedule.addRecord(record);
        schedule.eraseRecord(record);

        assertEquals(schedule.getRecords().size(),0);
    }

    @Test
    public void testAddDuplicateRecord(){
        Record record = new Record(new User("Miwa","229"),LocalTime.of(15,15));

        schedule.addRecord(record);
        schedule.addRecord(record);
        schedule.addRecord(record);

        assertEquals(schedule.getRecords().size(),1);
    }
}
