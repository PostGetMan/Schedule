package org.postgetman.schedule.app.domain.user;

import java.util.List;

public class Sickness {

    private String name;

    private List<User> userList;

    public Sickness(){

    }

    public Sickness(final String name){
        this.name = name;
    }
}
