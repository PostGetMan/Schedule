package org.postgetman.schedule.app.domain.schedule;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import org.postgetman.schedule.app.domain.SuperEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.LocalDate;
import java.time.LocalTime;

@Getter
@Setter
@EqualsAndHashCode
@Entity
@Table(name = "schedules")
public class Schedule extends SuperEntity{

    @Column(name = "date")
    private LocalDate date;

    @Column(name = "timeFrom")
    private LocalTime timeFrom;

    @Column(name = "timeTo")
    private LocalTime timeTo;

//    @OneToMany(orphanRemoval = true,fetch = FetchType.EAGER)
//    private List<Record> records;

    public Schedule(){

    }

    public Schedule(final String date,final String timeFrom,final String timeTo){
        this.date = LocalDate.parse(date);
        this.timeFrom = LocalTime.parse(timeFrom);
        this.timeTo = LocalTime.parse(timeTo);
    }

}
