package org.postgetman.schedule.app.domain;

import org.postgetman.schedule.app.domain.user.User;

import java.util.List;

public class Role extends SuperEntity{

    private String name;

    private List<User> userList;

    public Role(){

    }

    public Role(final String name){
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
