package com.dys.bs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.expression.ParserContext;

@RequestMapping("/dls")
@Controller
public class FirstExtranetServiceController {

    @RequestMapping("/index")
    public String index(){
        return "index";
    }

}
