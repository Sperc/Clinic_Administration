package com.fan.service;

import com.fan.model.Employee;

import java.util.List;

/**
 * Created by Pawel on 12.01.2018.
 */
public interface EmployeeService {
    List<Employee> findAll();
    void delete(Long id);
    Employee save(Employee e);
    Employee findOneById(Long id);
}
