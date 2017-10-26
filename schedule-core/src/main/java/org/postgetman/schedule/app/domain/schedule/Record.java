package org.postgetman.schedule.app.domain.schedule;

import lombok.Getter;
import lombok.Setter;
import org.postgetman.schedule.app.domain.SuperEntity;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;

@Getter
@Setter
@Entity
@Table(name = "records")
public class Record extends SuperEntity{

    @ManyToOne
    @JoinColumn(name = "schedule_id",nullable = false, foreignKey = @ForeignKey(name = "SCHEDULE_ID_FK"))
    private Schedule schedule;

    @Column(name = "date")
    private LocalDate date;

    @Column(name = "time")
    private LocalTime time;

    public Record(){

    }

    public Record(final String date, final String time){
        this.date = LocalDate.parse(date);
        this.time = LocalTime.parse(time);
    }


}
