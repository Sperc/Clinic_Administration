package com.fan.controller;

import com.fan.model.Patient;
import com.fan.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
 * Created by Pawel on 11.01.2018.
 */
@Controller
public class PatientController {
    @Autowired
    private PatientService patientService;


    @GetMapping("/patients")
    public String patients(Model model){
        List<Patient> patients = patientService.findAll();
        model.addAttribute("allPatients",patients);
        return "patient";
    }
}
