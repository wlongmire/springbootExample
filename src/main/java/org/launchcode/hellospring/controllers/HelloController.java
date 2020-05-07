package org.launchcode.hellospring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("hello")
@ResponseBody
public class HelloController {

    @GetMapping("")
    public String helloWithQueryParam(@RequestParam String name){
        return ("Hello, " + name + "!");
    }

    @GetMapping("{name}")
    public String helloWithPathParam(@PathVariable String name){
        return("Hello, " + name + "!");
    }

    @GetMapping("form")
    public String helloForm(){
        String html =
                "<html>" +
                        "<body>" +
                        "<form method = 'get' action = '/hello'>" +
                        "<input type = 'text' name='name' />" +
                        "<input type = 'submit' value='Greet Me!' />" +
                        "</form>" +
                        "</body>" +
                        "</html>";
        return html;
    }
}
