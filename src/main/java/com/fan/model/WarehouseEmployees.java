package com.fan.model;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Pawel on 16.11.2017.
 */
@Entity
public class WarehouseEmployees {
    @GeneratedValue
    @Id
    private Long id;
    private int maxNumberOfEmployees;
    @OneToMany(mappedBy = "warehouseEmployees")
    private List<Employee> employees;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getMaxNumberOfEmployees() {
        return maxNumberOfEmployees;
    }

    public void setMaxNumberOfEmployees(int maxNumberOfEmployees) {
        this.maxNumberOfEmployees = maxNumberOfEmployees;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }
}
