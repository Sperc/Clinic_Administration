package com.fan.rest;

import com.fan.model.Item;
import com.fan.model.Stocktaking;
import com.fan.service.StocktakingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
    @CrossOrigin
    @RequestMapping(value = "/add-inw", method = RequestMethod.POST)
    public ResponseEntity updateHosting(@RequestBody Stocktaking stocktaking) {
        return new ResponseEntity(HttpStatus.OK);
    }

}
