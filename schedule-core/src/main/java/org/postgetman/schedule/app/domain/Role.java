package org.postgetman.schedule.app.domain;

import org.postgetman.schedule.app.domain.user.User;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="roles")
public class Role extends SuperEntity{

    @Column(name = "name")
    private String name;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
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
