package com.fan.controller;

import com.fan.model.Employee;
import com.fan.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.List;

/**
 * Created by Pawel on 11.01.2018.
 */
@Controller
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @ModelAttribute("allEmployees")
    public List<Employee> employeeList(){
        return employeeService.findAll();
    }

    @GetMapping("/employee")
    public String employee(){
        return "employee";
    }

    @GetMapping("/employees")
    public String employees(){
        return "employees";
    }
}
