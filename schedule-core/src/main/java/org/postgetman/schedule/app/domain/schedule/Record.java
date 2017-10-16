package org.postgetman.schedule.app.domain.schedule;

import org.postgetman.schedule.app.domain.SuperEntity;
import org.postgetman.schedule.app.domain.user.User;

import java.time.LocalTime;

public class Record extends SuperEntity{

    private User patient;

    private LocalTime time;

    public Record(){

    }

    public Record(User patient){
        this.patient = patient;
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
