/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.rapture;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class greeting {
    
    @RequestMapping(path="/index",method = RequestMethod.GET)
    public String index(){
        return "index";
    }
    
    @RequestMapping(path = "/greeting",method = RequestMethod.POST)
    public String greeting(ModelMap model){
        model.addAttribute("greeting", "Welcome");
        System.out.println("Greet "+"Welcome");
        return "test";
    }
    
    @RequestMapping(path = "/ready",method = RequestMethod.POST)
    public String read(ModelMap model){
        model.addAttribute("ready", "Check");
        return "check";
    }
}
