package com.fan.service.impl;

import com.fan.model.ContractType;
import com.fan.repository.ContractTypeRepository;
import com.fan.service.ContractTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Pawel on 20.01.2018.
 */
@Service
public class ContractTypeServiceImpl implements ContractTypeService{
    @Autowired
    ContractTypeRepository contractTypeRepository;

    @Override
    public ContractType finOne(Long id) {
        return contractTypeRepository.findOne(id);
    }
}
