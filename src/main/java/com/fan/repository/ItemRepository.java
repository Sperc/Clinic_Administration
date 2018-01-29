package com.fan.repository;

import com.fan.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Pawel on 20.01.2018.
 */

public interface ItemRepository extends JpaRepository<Item,Long>{
    @Override
    Item findOne(Long aLong);

}
