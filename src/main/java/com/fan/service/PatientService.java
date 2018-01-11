package com.fan.service;

import com.fan.model.Patient;

import java.util.List;

/**
 * Created by Pawel on 04.12.2017.
 */
public interface PatientService {
    Patient addPatient(Patient p);
    Patient findByPesel(String pesel);
    List<Patient> findByName(String fristName,String lastName);
    Patient save(Patient patient);
    List<Patient> findAll();
    void delete(Long id);
}
