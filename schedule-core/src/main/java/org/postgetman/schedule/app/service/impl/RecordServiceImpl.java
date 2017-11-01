package org.postgetman.schedule.app.service.impl;

import org.postgetman.schedule.app.domain.schedule.Record;
import org.postgetman.schedule.app.domain.schedule.Schedule;
import org.postgetman.schedule.app.repository.RecordRepository;
import org.postgetman.schedule.app.service.RecordService;
import org.postgetman.schedule.app.service.ScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class RecordServiceImpl implements RecordService{

    @Autowired
    private ScheduleService scheduleService;

    @Autowired
    private RecordRepository recordRepository;

    @Override
    public List<Record> findAll() {
        return recordRepository.findAll();
    }

    @Override
    public List<Record> findAllByDate(final String date) {
        List<Record> resultList = new ArrayList<>();

        for(Record record : findAll()){
            if(record.getDate().equals(LocalDate.parse(date))){
                resultList.add(record);
            }
        }
        return resultList;
    }

    @Override
    public Record findOne(Long id) {
        return null;
    }

    @Override
    public void addRecord(Record record) {
        Schedule schedule = scheduleService.findByDate(record.getDate());

        if(schedule != null){
            schedule.addRecord(record);
        }
        recordRepository.save(record);
    }

    @Override
    public void deleteRecord(Long id) {
        recordRepository.deleteById(id);
    }
}
