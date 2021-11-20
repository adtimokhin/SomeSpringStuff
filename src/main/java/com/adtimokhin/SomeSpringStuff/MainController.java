package com.adtimokhin.SomeSpringStuff;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author adtimokhin
 * 20.11.2021
 **/

@Controller
public class MainController {
    @GetMapping("/")
    public String index(){
        return "redirect:html/entries/01.Introduciton.html";
    }
}
