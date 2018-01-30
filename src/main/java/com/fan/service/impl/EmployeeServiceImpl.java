package com.fan.service.impl;

import com.fan.model.Employee;
import com.fan.repository.EmployeeRepository;
import com.fan.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Pawel on 12.01.2018.
 */
@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }

    @Override
    public void delete(Long id) {
        employeeRepository.delete(id);
    }

    @Override
    public Employee save(Employee e) {
        return employeeRepository.save(e);
    }

    @Override
    public Employee findOneById(Long id) {
        return employeeRepository.findById(id);
    }

    @Override
    public Employee findByContractId(Long id) {
        return employeeRepository.findByContractTypeId(id);
    }

    @Override
    public Employee findByFirstNameLastNamePostion(String firstName, String lastName, String position) {
        return employeeRepository.findByFirstNameAndLastNameAndPosition(firstName,lastName,position);
    }
}
