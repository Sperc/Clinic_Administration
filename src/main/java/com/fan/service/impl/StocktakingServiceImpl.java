package com.fan.service.impl;

import com.fan.model.Stocktaking;
import com.fan.repository.ItemRepository;
import com.fan.repository.StocktakingRepository;
import com.fan.service.StocktakingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Pawel on 13.01.2018.
 */
@Service
public class StocktakingServiceImpl implements StocktakingService {
    @Autowired
    StocktakingRepository stocktakingRepository;

    @Autowired
    ItemRepository itemRepository;

    @Override
    public Stocktaking save(Stocktaking s) {
        return stocktakingRepository.save(s);
    }

    @Override
    public List<Stocktaking> findAll() {
        return stocktakingRepository.findAll();
    }

    @Override
    public Stocktaking findById(Long id) {
        return stocktakingRepository.findById(id);
    }

    @Override
    public void delete(Long id) {
        stocktakingRepository.delete(id);
    }
}
