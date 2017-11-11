package org.postgetman.schedule.app.domain.user;

import lombok.Getter;
import lombok.Setter;
import org.postgetman.schedule.app.domain.SuperEntity;

import javax.persistence.*;
import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "profile")
public class UserProfile extends SuperEntity{

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private User user;

    @Column(name="firstname")
    private String firstName;

    @Column(name="lastname")
    private String lastName;

    @Column(name = "birthday")
    private LocalDate birthday;

    @Column(name = "adress")
    private String adress;

    @Column(name = "phone")
    private int phone;

    public UserProfile(){

    }

    public UserProfile(final String firstName, final String lastName, String birthday){
        this.firstName = firstName;
        this.birthday = LocalDate.parse(birthday);
    }


}
