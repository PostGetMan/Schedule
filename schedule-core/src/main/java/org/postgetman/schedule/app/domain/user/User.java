package org.postgetman.schedule.app.domain.user;

import org.postgetman.schedule.app.domain.Role;
import org.postgetman.schedule.app.domain.SuperEntity;

import java.util.Set;

public class User extends SuperEntity{

    private String login;

    private String password;

    private String email;

    private Set<Role> roles;

    public User(){

    }

    public User(final String login,final String password){
        this.login = login;
        this.password = password;
    }
}
