package org.postgetman.schedule.app.domain.user;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import org.postgetman.schedule.app.domain.Role;
import org.postgetman.schedule.app.domain.SuperEntity;

import javax.persistence.*;

@Setter
@Getter
@EqualsAndHashCode
@Entity
@Table(name = "users")
public class User extends SuperEntity{

    @Column(name="fullname")
    private String fullName;

    @Column(name = "login")
    private String login;

    @Column(name = "password")
    private String password;

    @Column(name = "email")
    private String email;

    @ManyToOne
    @JoinColumn(name = "role_id", foreignKey = @ForeignKey(name = "ROLE_ID_FK"))
    private Role role;

//    @OneToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
//    private UserProfile userProfile;

    public User(){

    }

    public User(final String login,final String email){
        this.login = login;
        this.email = email;
    }

}
