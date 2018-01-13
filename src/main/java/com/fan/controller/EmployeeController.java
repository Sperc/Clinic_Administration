package com.fan.controller;

import com.fan.model.Employee;
import com.fan.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;

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

    @GetMapping("/employee-delete")
    public String deleteEmployee(@RequestParam(name = "id")String id){
        Long id_employee = new Long(id);
        employeeService.delete(id_employee);
        return "redirect:/employees";
    }

}
