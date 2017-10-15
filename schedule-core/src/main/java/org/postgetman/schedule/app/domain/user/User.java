package org.postgetman.schedule.app.domain.user;

import org.postgetman.schedule.app.domain.BaseEntity;
import org.postgetman.schedule.app.domain.Role;

import java.util.Set;

public class User extends BaseEntity{

    private String login;

    private String password;

    private String email;

    private Set<Role> roles;

    public User(){

    }

    public User(final String login,final String password){

    }
}
