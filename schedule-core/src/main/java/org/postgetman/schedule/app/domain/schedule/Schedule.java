package org.postgetman.schedule.app.domain.schedule;

import org.postgetman.schedule.app.domain.Day;
import org.postgetman.schedule.app.domain.SuperEntity;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Schedule extends SuperEntity{

    private LocalDate date;

    private LocalTime timeFrom;

    private LocalTime timeTo;

    private List<Record> records;

    public Schedule(){

    }

    public Schedule(LocalTime timeFrom, LocalTime timeTo){
        this.timeFrom = timeFrom;
        this.timeTo = timeTo;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public LocalTime getTimeFrom() {
        return timeFrom;
    }

    public void setTimeFrom(LocalTime timeFrom) {
        this.timeFrom = timeFrom;
    }

    public LocalTime getTimeTo() {
        return timeTo;
    }

    public void setTimeTo(LocalTime timeTo) {
        this.timeTo = timeTo;
    }

    public List<Record> getRecords() {
        return records;
    }

    public void setRecords(List<Record> records) {
        this.records = records;
    }

    public void addRecord(Record record){
        if(records == null){
            records = new ArrayList<>();
        }
        if(!records.contains(record)){
            records.add(record);
        }
    }

    public void eraseRecord(Record record){
        if(records.contains(record)){
            records.remove(record);
        }
    }
}
