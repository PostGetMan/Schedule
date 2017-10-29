package org.postgetman.schedule.app.service;

import org.postgetman.schedule.app.domain.schedule.Record;

import java.util.List;

public interface RecordService {

    List<Record> findAll(String date);

    Record findOne(Long id);

    void addRecord(Record record);

    void deleteRecord(Long id);
}
