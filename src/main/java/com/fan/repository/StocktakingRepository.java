package com.fan.repository;

import com.fan.model.Stocktaking;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Pawel on 13.01.2018.
 */
public interface StocktakingRepository extends JpaRepository<Stocktaking,Long>{
    @Override
    <S extends Stocktaking> S save(S s);
}
