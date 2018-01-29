package com.fan.service;

import com.fan.model.Stocktaking;

import java.util.List;

/**
 * Created by Pawel on 13.01.2018.
 */
public interface StocktakingService {
    Stocktaking save(Stocktaking s);
    List<Stocktaking> findAll();
    Stocktaking findById(Long id);
    Stocktaking deleteItemFromStocktaking(Long stocktaking_id,Long item_id);
    void delete(Long id);
}
