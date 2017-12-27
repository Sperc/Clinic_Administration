package com.fan.model;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by Pawel on 24.12.2017.
 */
@Entity
public class Role {
    @GeneratedValue
    @Id
    private Long id;
    private String name;
    @ManyToMany(mappedBy = "roles")
    private Set<AppUser> appUsers;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<AppUser> getAppUsers() {
        return appUsers;
    }

    public void setAppUsers(Set<AppUser> appUsers) {
        this.appUsers = appUsers;
    }
}
