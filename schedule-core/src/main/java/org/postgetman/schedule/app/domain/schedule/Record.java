package org.postgetman.schedule.app.domain.schedule;

import org.postgetman.schedule.app.domain.SuperEntity;
import org.postgetman.schedule.app.domain.user.User;

import java.time.LocalDate;
import java.time.LocalTime;

public class Record extends SuperEntity{

    private Schedule schedule;

    private LocalDate date;

    private User patient;

    private LocalTime time;

    public Record(){

    }

    public Record(final String date, LocalTime time){
        this.date = LocalDate.parse(date);
        this.time = time;
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

    public User getPatient() {
        return patient;
    }

    public void setPatient(User patient) {
        this.patient = patient;
    }

    public LocalTime getTime() {
        return time;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }
}
