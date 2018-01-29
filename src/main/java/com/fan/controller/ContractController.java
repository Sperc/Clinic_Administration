package com.fan.controller;

import com.fan.service.ContractTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by Pawel on 19.01.2018.
 */
@Controller
public class ContractController {
    @Autowired
    ContractTypeService contractTypeService;

//    @GetMapping("/contractdetails")
//    public String contract(@RequestParam(name = "id") Long id,Model model){
//        model.addAttribute("contract",contractTypeService.finOne(id));
//        return "contractdetails";
//    }
}
