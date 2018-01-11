package com.fan.controller;

import com.fan.service.AppUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by Pawel on 25.12.2017.
 */
@Controller
public class UserController {
    @Autowired
    private AppUserService appUserService;

    @RequestMapping(value = "/login",method = RequestMethod.GET)
    public String login(Model model,String error,String logout){
        if(error!=null){
            model.addAttribute("message","You have been logged succesfull");
        }
        if(logout!=null){
            model.addAttribute("message","You have been logout succesfully");
        }
        return "login";
    }
    @RequestMapping(value = "/")
    public String index(){
        return "index";
    }
}
