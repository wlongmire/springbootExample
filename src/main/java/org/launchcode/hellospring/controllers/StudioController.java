package org.launchcode.hellospring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("studio")
@ResponseBody
public class StudioController {

    @GetMapping()
    public String homePath(){
        String html = "<html>" +
                "<body>" +
                "<h1>Skills Tracker</h1>" +
                "<ol>" +
                "<li>Java</li>" +
                "<li>Javascript</li>" +
                "<li>Python</li>" +
                "</ol>" +
                "</body>" +
                "</html>";
        return(html);
    }

    @GetMapping("form")
    public String formPath(){
        String html =
                "<html>" +
                        "<body>" +
                        "<form method='post'>" +
                        "<label>Name</label>" +
                        "<input type = 'text' name='name' /><br/>" +
                        "<select name='language1'>" +
                        "<option value='Java'>Java</option>" +
                        "<option value='Python'>Python</option>" +
                        "<option value='Javascript'>Javascript</option>" +
                        "</select>" +
                        "<select name='language2'>" +
                        "<option value='Java'>Java</option>" +
                        "<option value='Python'>Python</option>" +
                        "<option value='Javascript'>Javascript</option>" +
                        "</select>" +
                        "<select name='language3'>" +
                        "<option value='Java'>Java</option>" +
                        "<option value='Python'>Python</option>" +
                        "<option value='Javascript'>Javascript</option>" +
                        "</select>" +
                        "<input type = 'submit' value='Submit' />" +
                        "</form>" +
                        "</body>" +
                        "</html>";
        return html;
    }

    @PostMapping("form")
    public String namePath(@RequestParam String name, @RequestParam String language1, @RequestParam String language2, @RequestParam String language3) {
        String html = "<h1>" + name + "</h1>" +
                "<ol>" +
                "<li>" + language1 + "</li>" +
                "<li>" + language2 + "</li>" +
                "<li>" + language3 + "</li>" +
                "</ol>";
        return html;
    }
}
