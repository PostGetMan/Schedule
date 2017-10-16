package org.postgetman.schedule.app.domain.user;

import org.postgetman.schedule.app.domain.SuperEntity;

import java.util.List;

public class Sickness extends SuperEntity{

    private String name;

    private List<User> userList;

    public Sickness(){

    }

    public Sickness(final String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }
}
