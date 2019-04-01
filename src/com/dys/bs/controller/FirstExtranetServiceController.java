package com.dys.bs.controller;

import com.dys.bs.test.socket.WebSockets;
import org.java_websocket.drafts.Draft_6455;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.expression.ParserContext;

import javax.annotation.PostConstruct;

@RequestMapping("/dls")
@Controller
public class FirstExtranetServiceController {
    @PostConstruct
    private void afterInitialization() {
        WebSockets webSocketService = null;
        webSocketService = new WebSockets(8080, new Draft_6455());

        webSocketService.setConnectionLostTimeout(0);

        webSocketService.start();
    }
    @RequestMapping("/index")
    public String index(){
        return "index";
    }

}
