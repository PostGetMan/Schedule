package org.postgetman.schedule.app.service.impl;

import org.postgetman.schedule.app.domain.schedule.Record;
import org.postgetman.schedule.app.repository.RecordRepository;
import org.postgetman.schedule.app.service.RecordService;
import org.postgetman.schedule.app.service.ScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecordServiceImpl implements RecordService{

    @Autowired
    private ScheduleService scheduleService;

    @Autowired
    private RecordRepository recordRepository;

    @Override
    public List<Record> findAll(final String date) {
        return null;
    }

    @Override
    public Record findOne(Long id) {
        return null;
    }

    @Override
    public void addRecord(Record record) {

    }

    @Override
    public void deleteRecord(Long id) {

    }
}
