package org.postgetman.schedule.app.domain.user;

import lombok.Getter;
import lombok.Setter;
import org.postgetman.schedule.app.domain.SuperEntity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToOne;
import java.time.LocalDate;

@Getter
@Setter
@Entity
public class UserProfile extends SuperEntity{

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private User user;

    private String firstName;

    private String lastName;

    private LocalDate birthday;

    private String street;

    private int phone;

    public UserProfile(){

    }

    public UserProfile(final String firstName, final String lastName, String birthday){
        this.firstName = firstName;
        this.birthday = LocalDate.parse(birthday);
    }


}
