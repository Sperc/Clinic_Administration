package com.fan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Pawel on 11.01.2018.
 */
@Controller
public class StocktakingController {
    @GetMapping("/stocktaking")
    public String stocktaking(){
        return "stocktaking";
    }

}
