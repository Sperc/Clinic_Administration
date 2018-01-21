package com.fan.repository;

import com.fan.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by Pawel on 04.12.2017.
 */
public interface EmployeeRepository extends JpaRepository<Employee,Long>{
    @Override
    Employee getOne(Long aLong);

    @Override
    List<Employee> findAll();

    Employee findById(Long id);
    List<Employee> findAllByPosition(String position);
    List<Employee> findAllByFirstNameAndLastName(String firstName,String lastName);

    @Override
    void delete(Long aLong);

    @Override
    <S extends Employee> S save(S s);
}
