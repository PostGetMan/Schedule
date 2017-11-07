package org.postgetman.schedule.app.domain;

import lombok.Getter;
import lombok.Setter;
import org.postgetman.schedule.app.domain.user.User;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name="roles")
public class Role extends SuperEntity{

    @Column(name = "name")
    private String name;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    private List<User> userList;

    public Role(){

    }

    public Role(final Long id){
        this.setId(id);
    }



}
