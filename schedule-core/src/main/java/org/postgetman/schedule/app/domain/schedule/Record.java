package org.postgetman.schedule.app.domain.schedule;

import org.postgetman.schedule.app.domain.SuperEntity;
import org.postgetman.schedule.app.domain.user.User;

import java.time.LocalTime;


public class Record extends SuperEntity{

    private User user;

    private LocalTime time;

    public Record(){

    }

}
