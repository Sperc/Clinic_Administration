package com.fan.rest;

import com.fan.model.Item;
import com.fan.model.Stocktaking;
import com.fan.service.StocktakingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Pawel on 13.01.2018.
 */
@RestController("/stocktaking")
public class StocktakingController {
    @Autowired
    StocktakingService stocktakingService;
    @PostMapping("/get")
    public HttpEntity getStocktakingList(@RequestBody Stocktaking stocktaking){
        stocktakingService.save(stocktaking);
        return new ResponseEntity(HttpStatus.OK);
    }   

}
