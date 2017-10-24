package org.postgetman.schedule.app.domain.schedule;

import org.postgetman.schedule.app.domain.SuperEntity;

import java.time.LocalDate;
import java.time.LocalTime;

public class Record extends SuperEntity{

    private Schedule schedule;

    private LocalDate date;

    private LocalTime time;

    public Record(){

    }

    public Record(final String date, final String time){
        this.date = LocalDate.parse(date);
        this.time = LocalTime.parse(time);
    }

    public Schedule getSchedule() {
        return schedule;
    }

    public void setSchedule(Schedule schedule) {
        this.schedule = schedule;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public LocalTime getTime() {
        return time;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }
}
