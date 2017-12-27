package com.fan.repository;

import com.fan.model.Equipment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by Pawel on 04.12.2017.
 */
public interface EquipmentRepository extends JpaRepository<Equipment,Long> {
    @Override
    List<Equipment> findAll();

    @Override
    Equipment getOne(Long aLong);
}
