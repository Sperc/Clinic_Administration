package com.fan.repository;

import com.fan.model.ContractType;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Pawel on 20.01.2018.
 */
public interface ContractTypeRepository extends JpaRepository<ContractType,Long>{
    @Override
    ContractType findOne(Long aLong);
}
