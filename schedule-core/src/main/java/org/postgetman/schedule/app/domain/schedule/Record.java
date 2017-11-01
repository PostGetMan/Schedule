package org.postgetman.schedule.app.domain.schedule;

import lombok.Getter;
import lombok.Setter;
import org.postgetman.schedule.app.domain.SuperEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.transaction.Transactional;
import java.time.LocalDate;
import java.time.LocalTime;

@Getter
@Setter
@Entity
@Transactional
@Table(name="records")
public class Record extends SuperEntity{

    @ManyToOne
    private Schedule schedule;

    @Column(name = "date")
    private LocalDate date;

    @Column(name = "time")
    private LocalTime time;

    @Column(name = "complaint")
    private String complaint;

    public Record(){

    }

    public Record(final String date, final String time){
        this.date = LocalDate.parse(date);
        this.time = LocalTime.parse(time);
    }


}
