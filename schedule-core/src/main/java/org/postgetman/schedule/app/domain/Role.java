package org.postgetman.schedule.app.domain;

import org.postgetman.schedule.app.domain.user.User;

import java.util.List;

public class Role extends BaseEntity{

    private String name;

    private List<User> userList;

    public Role(){

    }

    public Role(final String name){
        this.name = name;
    }
}
