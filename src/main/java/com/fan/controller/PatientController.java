package com.fan.controller;

import com.fan.model.Patient;
import com.fan.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

/**
 * Created by Pawel on 11.01.2018.
 */
@Controller()
public class PatientController {
    @Autowired
    private PatientService patientService;

    @ModelAttribute("allPatient")
    private List<Patient> allPatients(){
        return patientService.findAll();
    }

    @GetMapping("patient")
    public String patient() {
        return "patient";
    }

    @GetMapping("/patients")
    public String patients() {
        return "patients";
    }

    @GetMapping("/register")
    public String register(){
        return "registerform";
    }

    @PostMapping("/patientRegister")
    public String registerPatient(@ModelAttribute Patient patient,Model model){
        patientService.save(patient);
        return "registerform";
    }

}
