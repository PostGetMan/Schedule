package org.postgetman.schedule.app.domain.schedule;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import org.postgetman.schedule.app.domain.SuperEntity;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@EqualsAndHashCode
public class Schedule extends SuperEntity{

    private LocalDate date;

    private LocalTime timeFrom;

    private LocalTime timeTo;

    private List<Record> records;

    public Schedule(){

    }

    public Schedule(final String date,final String timeFrom,final String timeTo){
        this.date = LocalDate.parse(date);
        this.timeFrom = LocalTime.parse(timeFrom);
        this.timeTo = LocalTime.parse(timeTo);
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
