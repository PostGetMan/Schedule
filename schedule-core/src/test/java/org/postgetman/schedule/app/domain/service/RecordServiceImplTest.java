package org.postgetman.schedule.app.domain.service;

import org.junit.Before;
import org.postgetman.schedule.app.service.RecordService;
import org.postgetman.schedule.app.service.ScheduleService;
import org.postgetman.schedule.app.service.impl.RecordServiceImpl;
import org.postgetman.schedule.app.service.impl.ScheduleServiceImpl;

public class RecordServiceImplTest {

    private RecordService service;

    private ScheduleService scheduleService;

    @Before
    public void setup(){
        service = new RecordServiceImpl();
        scheduleService = new ScheduleServiceImpl();
    }

}
