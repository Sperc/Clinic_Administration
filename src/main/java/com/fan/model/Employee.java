package com.fan.model;

import javax.persistence.*;
import java.lang.reflect.Type;

/**
 * Created by Pawel on 16.11.2017.
 */
@Entity
public class Employee {
    @Id
    @GeneratedValue
    private Long id;
    private String firstName;
    private String lastName;
    private String position;

    @ManyToOne
    private WarehouseEmployees warehouseEmployees;

    @ManyToOne
    private ContractType contractType;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public WarehouseEmployees getWarehouseEmployees() {
        return warehouseEmployees;
    }

    public void setWarehouseEmployees(WarehouseEmployees warehouseEmployees) {
        this.warehouseEmployees = warehouseEmployees;
    }

    public ContractType getContractType() {
        return contractType;
    }

    public void setContractType(ContractType contractType) {
        this.contractType = contractType;
    }
}
