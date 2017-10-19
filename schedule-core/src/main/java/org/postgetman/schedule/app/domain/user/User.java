package org.postgetman.schedule.app.domain.user;

import org.postgetman.schedule.app.domain.Role;
import org.postgetman.schedule.app.domain.SuperEntity;
import org.postgetman.schedule.app.domain.schedule.Record;

import java.util.List;
import java.util.Set;

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

    public List<Record> getRecordList() {
        return recordList;
    }

    public void setRecordList(List<Record> recordList) {
        this.recordList = recordList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;

        User user = (User) o;

        if (!login.equals(user.login)) return false;
        if (!password.equals(user.password)) return false;
        if (!email.equals(user.email)) return false;
        if (userCard != null ? !userCard.equals(user.userCard) : user.userCard != null) return false;
        return roles.equals(user.roles);
    }

    @Override
    public int hashCode() {
        int result = login.hashCode();
        result = 31 * result + password.hashCode();
        result = 31 * result + email.hashCode();
        result = 31 * result + (userCard != null ? userCard.hashCode() : 0);
        result = 31 * result + roles.hashCode();
        return result;
    }
}
