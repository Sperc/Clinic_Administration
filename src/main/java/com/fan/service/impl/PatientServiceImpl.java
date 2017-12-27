package com.fan.service.impl;

import com.fan.model.Patient;
import com.fan.repository.PatientRepository;
import com.fan.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Pawel on 04.12.2017.
 */
@Service
public class PatientServiceImpl implements PatientService {
    @Autowired
    private PatientRepository patientRepository;

    @Override
    public Patient addPatient(Patient p) {
        return patientRepository.save(p);
    }

    @Override
    public Patient findByPesel(String pesel) {
        return patientRepository.findByPesel(pesel);
    }

    @Override
    public List<Patient> findByName(String fristName, String lastName) {
        return patientRepository.findByFirstNameAndLastName(fristName,lastName);
    }

}
