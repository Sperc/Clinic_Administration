package com.fan.controller;

import com.fan.model.Employee;
import com.fan.model.Patient;
import com.fan.service.EmployeeService;
import com.fan.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Pawel on 11.01.2018.
 */
@Controller()
public class PatientController {
    @Autowired
    private PatientService patientService;

    @Autowired
    private EmployeeService employeeService;

    @ModelAttribute("allPatient")
    private List<Patient> allPatients(){
        return patientService.findAll();
    }

    @ModelAttribute("allDoctors")
    private List<Employee> allDoctors(){
        return employeeService.findAll().stream().filter(p->p.getPosition().equalsIgnoreCase("lekarz")).collect(Collectors.toList());
    }

//    @GetMapping("/patient")
//    public String patient() {
//        return "patient";
//    }

    @GetMapping("/delete")
    public String deletePatient(@RequestParam(name = "id") String id){
        String w = id;
        Long id_patient = new Long(id);
        patientService.delete(id_patient);
        return "redirect:/patients";
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
        return "redirect:/patients";
    }
    @GetMapping("/patient")
    public String editPatient(@RequestParam(name = "id")Long id,Model model){
        model.addAttribute("patient",patientService.findOne(id));
        return "patienteditform";
    }
    @PostMapping("/patient-edit")
    public String editPatientForm(@ModelAttribute Patient patient){
        patientService.save(patient);
        return "patients";
    }

}
