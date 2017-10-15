package org.postgetman.schedule.app.domain.schedule;

import org.postgetman.schedule.app.domain.Day;

import java.time.LocalTime;
import java.util.List;

public class Schedule {

    private Day day;

    private LocalTime timeFrom;

    private LocalTime timeTo;

    private List<Record> records;

    public Schedule(){

    }

    public Schedule(Day day, LocalTime timeFrom, LocalTime timeTo){
        this.day = day;
        this.timeFrom = timeFrom;
        this.timeTo = timeTo;
    }


}
