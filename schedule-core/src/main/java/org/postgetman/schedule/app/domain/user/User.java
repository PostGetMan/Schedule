package org.postgetman.schedule.app.domain.user;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import org.postgetman.schedule.app.domain.Role;
import org.postgetman.schedule.app.domain.SuperEntity;
import org.postgetman.schedule.app.domain.schedule.Record;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Setter
@Getter
@EqualsAndHashCode
@Entity
@Table(name = "users")
public class User extends SuperEntity implements Serializable{

    @Column(name="fullname")
    private String fullname;

    @Column(name = "login")
    private String login;

    @Column(name = "password")
    private String password;

    @Column(name = "email")
    private String email;

    @ManyToOne
    @JoinColumn(name = "role_id", foreignKey = @ForeignKey(name = "role_id_fk"))
    private Role role = new Role(1L);

    @OneToMany(cascade = CascadeType.ALL,orphanRemoval = true)
    private List<Record> recordList;

    public User(){

    }

    public User(final String login,final String password){
        this.login = login;
        this.password = password;
    }

    @Override
    public String toString(){
        return fullname;
    }

}
