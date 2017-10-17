package org.postgetman.schedule.app.dto;

import java.time.LocalDate;
import java.time.LocalTime;

public class ScheduleDTO {

    private LocalDate date;

    private LocalTime timeFrom;

    private LocalTime timeTo;

    public ScheduleDTO(){

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
}
