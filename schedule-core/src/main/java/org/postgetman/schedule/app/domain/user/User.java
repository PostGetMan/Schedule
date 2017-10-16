package org.postgetman.schedule.app.domain.user;

import org.postgetman.schedule.app.domain.Role;
import org.postgetman.schedule.app.domain.SuperEntity;

import java.util.Set;

public class User extends SuperEntity{

    private String login;

    private String password;

    private String email;

    private UserCard userCard;

    private Set<Role> roles;

    public User(){

    }

    public User(final String login,final String password){
        this.login = login;
        this.password = password;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public UserCard getUserCard() {
        return userCard;
    }

    public void setUserCard(UserCard userCard) {
        this.userCard = userCard;
    }

    public Set<Role> getRoles() {
        return roles;
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }
}
