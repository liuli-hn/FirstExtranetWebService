package com.dys.bs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/dls")
@Controller
public class FirstExtranetServiceController {

    @RequestMapping("/index")
    public String index(){
        return "index";
    }

}
