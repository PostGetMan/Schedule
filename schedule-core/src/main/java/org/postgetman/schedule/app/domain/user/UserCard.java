package org.postgetman.schedule.app.domain.user;

import org.postgetman.schedule.app.domain.SuperEntity;

import java.time.LocalDate;
import java.util.Set;

public class UserCard extends SuperEntity{

    private User user;

    private String firstName;

    private String lastName;

    private LocalDate birthday;

    private String street;

    private int phone;

    private Set<Sickness> sicknessList;

    public UserCard(){

    }

    public UserCard(final String firstName,final String lastName,LocalDate birthday){
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthday = birthday;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public Set<Sickness> getSicknessList() {
        return sicknessList;
    }

    public void setSicknessList(Set<Sickness> sicknessList) {
        this.sicknessList = sicknessList;
    }
}
