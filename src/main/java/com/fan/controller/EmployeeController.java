package com.fan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by Pawel on 11.01.2018.
 */
@Controller
public class EmployeeController {

    @GetMapping("/employee")
    public String employees(){
        return "employee";
    }
}
