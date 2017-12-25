package org.postgetman.schedule.app.domain.schedule;

import lombok.Getter;
import lombok.Setter;
import org.postgetman.schedule.app.domain.SuperEntity;
import org.postgetman.schedule.app.domain.user.User;

import javax.persistence.*;
import javax.transaction.Transactional;
import java.time.LocalDate;
import java.time.LocalTime;

@Getter
@Setter
@Entity
@Transactional
@Table(name="records")
public class Record extends SuperEntity{

    @Column(name = "date")
    private LocalDate date;

    @Column(name = "time")
    private LocalTime time;

    @Column(name = "complaint")
    private String complaint;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(columnDefinition = "text",name = "fullname",referencedColumnName = "fullname")
    private User fullname;

    public Record(){

    }

    public Record(final String date, final String time){
        this.date = LocalDate.parse(date);
        this.time = LocalTime.parse(time);
    }


}
