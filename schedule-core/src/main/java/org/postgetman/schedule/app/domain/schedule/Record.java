package org.postgetman.schedule.app.domain.schedule;

import org.postgetman.schedule.app.domain.BaseEntity;
import org.postgetman.schedule.app.domain.user.User;

import java.time.LocalTime;

public class Record extends BaseEntity{

    private User user;

    private LocalTime time;


}
