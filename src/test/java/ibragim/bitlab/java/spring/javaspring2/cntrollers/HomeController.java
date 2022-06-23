package ibragim.bitlab.java.spring1.javaspring1.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller

public class HomeController {

    @GetMapping(value = "/")
    public String index(){
        return "indexPage";
    }


    @GetMapping(value = "/about")
    public String aboutPage(){
        return "about";
    }
}
