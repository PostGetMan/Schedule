package org.postgetman.schedule.app.service.impl;

import org.postgetman.schedule.app.domain.schedule.Record;
import org.postgetman.schedule.app.service.RecordService;
import org.postgetman.schedule.app.service.ScheduleService;

import java.util.List;

public class RecordServiceImpl implements RecordService{

    private ScheduleService scheduleService = new ScheduleServiceImpl();

    @Override
    public List<Record> findAll(final String date) {
        return scheduleService.findByDate(date).getRecords();
    }

    @Override
    public Record findOne() {
        return null;
    }

    @Override
    public void addrecord(Record record) {
        scheduleService.findByDate(record.getDate()).addRecord(record);
    }

    @Override
    public void deleteRecord(Long id) {

    }
}
