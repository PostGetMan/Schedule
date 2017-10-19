package org.postgetman.schedule.app.service.impl;

import org.postgetman.schedule.app.domain.schedule.Record;
import org.postgetman.schedule.app.domain.schedule.Schedule;
import org.postgetman.schedule.app.service.RecordService;
import org.postgetman.schedule.app.service.ScheduleService;

public class RecordServiceImpl implements RecordService{

    private ScheduleService scheduleService;

    public RecordServiceImpl(){
        scheduleService = new ScheduleServiceImpl();
    }

    @Override
    public void addRecord(Record record) {
        Schedule schedule = scheduleService.findByDate(record.getDate());

        if(schedule != null){
            schedule.addRecord(record);
        }
    }

}
