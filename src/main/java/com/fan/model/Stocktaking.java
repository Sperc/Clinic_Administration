package com.fan.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

/**
 * Created by Pawel on 13.01.2018.
 */
@Entity
public class Stocktaking {
    @GeneratedValue
    @Id
    private Long id;
    private String date;

    private Employee employee;
    @OneToMany
    private List<Item> itemList;
}
