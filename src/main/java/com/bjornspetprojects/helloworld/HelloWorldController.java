package com.bjornspetprojects.helloworld;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {
    @RequestMapping({"", "/","index","index.html"})
    public String index(){
        return "index";
    }
}
