package com.fan.controller;

import com.fan.model.Stocktaking;
import com.fan.service.StocktakingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Pawel on 11.01.2018.
 */
@Controller
public class StocktakingController {
    @Autowired
    StocktakingService stocktakingService;

    @ModelAttribute("allStocktaking")
    public List<Stocktaking> findAll() {
        return stocktakingService.findAll();
    }

    @GetMapping("/inwentaryzacja")
    public String stocktakings() {
        return "inwentaryzacje";
    }

    @GetMapping("/inwentaryzacja/usun")
    public String deleteStocktaking(@RequestParam("id") Long id, Model model) {
        stocktakingService.delete(id);
//        model.addAttribute("allStocktaking",stocktakingService.findAll());
        return "redirect:/inwentaryzacja/";
    }

    @GetMapping("/inwentaryzacja/{id}")
    public String stocktaking(@PathVariable("id") Long id, Model model) {
        Stocktaking stocktaking = stocktakingService.findById(id);
        model.addAttribute("stocktaking", stocktaking);
        return "inwentaryzacja";
    }

//    @GetMapping("/inwentaryzacja/delete-item")
//    public String removeItemFromStocktaking(@RequestParam("stocktaking_id") Long stocktaking_id,
//                                            @RequestParam("item_id") Long item_id, Model model) {
//        Stocktaking stocktaking = stocktakingService.deleteItemFromStocktaking(stocktaking_id, item_id);
//        model.addAttribute("itemList", stocktaking.getItemList());
//        return "redirect:/inwentaryzacja/" + String.valueOf(stocktaking_id);
//    }

//    @GetMapping("/inwentaryzacja/nowa")
//    public String newStocktaking() {
//        return "newinventarization";
//    }

    @PostMapping("/inventaryzacja/nowa/dodaj")
    public String addInventaryzation(@ModelAttribute Stocktaking stocktaking) {
        Stocktaking stocktaking1 = stocktakingService.findById(stocktaking.getId());
        if (stocktaking1 == null) {
            stocktakingService.save(stocktaking);
        } else {
            stocktaking.setId(stocktaking1.getId());
            stocktakingService.save(stocktaking);
        }

        return "redirect:/inwentaryzacja/";
    }

    @GetMapping("/inwentaryzacja/nowa")
    public String newStocktaking(@RequestParam(name = "id", required = false) Long id, Model model) {
        Stocktaking stocktaking = stocktakingService.findById(id);
        model.addAttribute("stocktaking", stocktaking);
        return "newinventarization";

    }


}
