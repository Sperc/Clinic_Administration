package com.fan.service.impl;

import com.fan.model.Stocktaking;
import com.fan.repository.StocktakingRepository;
import com.fan.service.StocktakingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Pawel on 13.01.2018.
 */
@Service
public class StocktakingServiceImpl implements StocktakingService {
    @Autowired
    StocktakingRepository stocktakingRepository;
    @Override
    public Stocktaking save(Stocktaking s) {
        return stocktakingRepository.save(s);
    }
}
