package org.postgetman.schedule.app.domain.user;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import org.postgetman.schedule.app.domain.Role;
import org.postgetman.schedule.app.domain.SuperEntity;
import org.postgetman.schedule.app.domain.schedule.Record;

import java.util.List;
import java.util.Set;

@Setter
@Getter
@EqualsAndHashCode
public class User extends SuperEntity{

    private String login;

    private String password;

    private String email;

    private UserCard userCard;

    private Set<Role> roles;

    private List<Record> recordList;

    public User(){

    }

    public User(final String login,final String email){
        this.login = login;
        this.email = email;
    }

}
