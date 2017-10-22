package org.postgetman.schedule.app.domain.user;

import lombok.Getter;
import lombok.Setter;
import org.postgetman.schedule.app.domain.SuperEntity;

import java.time.LocalDate;
import java.util.Set;

@Getter
@Setter
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
        this.birthday = birthday;
    }


}
