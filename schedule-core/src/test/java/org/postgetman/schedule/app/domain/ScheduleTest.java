package org.postgetman.schedule.app.domain;

import org.junit.Before;
import org.junit.Test;
import org.postgetman.schedule.app.domain.schedule.Record;
import org.postgetman.schedule.app.domain.schedule.Schedule;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ScheduleTest {

    private Schedule schedule;

    @Before
    public void setup(){
        schedule = new Schedule("2017-09-05","17:03","18:03");
    }

    @Test
    public void testAddRecordSuccess(){
        Record record = new Record("2017-09-28","14:15");

        schedule.addRecord(record);

        assertTrue(!schedule.getRecords().isEmpty());
    }

    @Test
    public void testEraseRecord(){
        Record record = new Record("2017-09-28","15:34");

        schedule.addRecord(record);
        schedule.eraseRecord(record);

        assertEquals(schedule.getRecords().size(),0);
    }

    @Test
    public void testAddDuplicateRecord(){
        Record record = new Record("2017-09-28","15:15");

        schedule.addRecord(record);
        schedule.addRecord(record);
        schedule.addRecord(record);

        assertEquals(schedule.getRecords().size(),1);
    }
}
