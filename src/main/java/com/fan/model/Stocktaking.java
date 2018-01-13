package com.fan.model;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Pawel on 13.01.2018.
 */
@Entity
public class Stocktaking {
    @GeneratedValue
    @Id
    private Long id;
    private String date;

    @OneToOne
    private Employee employee;

    @OneToMany
    private List<Item> itemList;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public List<Item> getItemList() {
        return itemList;
    }

    public void setItemList(List<Item> itemList) {
        this.itemList = itemList;
    }
}
