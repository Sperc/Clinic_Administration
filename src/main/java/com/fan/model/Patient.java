package com.fan.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * Created by Pawel on 16.11.2017.
 */
@Entity
public class Patient {
    @Id
    @GeneratedValue
    private Long id;
    @NotNull
    private String firstName;
    @NotNull
    private String lastName;
    @NotNull
    private String birthDay;
    @NotNull
    private String pesel;


    private Long employeeId;

    private String dateVisit;

    public String getBirthDay() {
        return birthDay;
    }

    public String getDateVisit() {
        return dateVisit;
    }

    public Long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Long employeeId) {
        this.employeeId = employeeId;
    }

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

    public String getPesel() {
        return pesel;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    public void setDateVisit(String dateVisit) {
        this.dateVisit = dateVisit;
    }
}
