package com.fan.repository;

import com.fan.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by Pawel on 04.12.2017.
 */
public interface PatientRepository extends JpaRepository<Patient,Long>{
    @Override
    List<Patient> findAll();

    @Override
    Patient getOne(Long aLong);

    List<Patient> findByFirstNameAndLastName(String firstName,String lastName);

    Patient findByPesel(String pesel);

    @Override
    void delete(Patient patient);

    @Override
    void delete(Long aLong);

    @Override
    <S extends Patient> S save(S s);

}
