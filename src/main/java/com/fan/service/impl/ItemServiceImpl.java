package com.fan.service.impl;

import com.fan.model.Item;
import com.fan.repository.ItemRepository;
import com.fan.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Pawel on 20.01.2018.
 */
@Service
public class ItemServiceImpl implements ItemService {
    @Autowired
    ItemRepository itemRepository;

    @Override
    public Item findOne(Long id) {
        return itemRepository.findOne(id);
    }
}
