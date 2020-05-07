package org.launchcode.hellospring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;

@Controller
@RequestMapping("event")
@ResponseBody
public class EventController {
    private static ArrayList<String> events = new ArrayList<>(Arrays.asList("Event 1", "Event 2", "Event 3"));

    @GetMapping("")
    public String eventHome() {
        return("<h1>All Events</h1>");
    }

//    @GetMapping("get")
    @RequestMapping(method={RequestMethod.POST, RequestMethod.GET}, value="get")
    public String eventGet(@RequestParam String index) {
        String event = events.get(Integer.valueOf(index));
        String html =   "<div><h1>Getting event" + index + " </div>" + event;
        return(html);
    }

    @GetMapping("get/{index}")
    public String eventPathGet(@PathVariable String index) {
        String event = events.get(Integer.valueOf(index));
        String html =   "<div><h1>Getting event" + index + " </div>" + event;

        return(html);
    }

    @GetMapping("create")
    public String eventCreate() {
        return("<div>" +
                "<form method='get' action='/event/get'>" +
                "<label>Event Index</label>" +
                "<input type='text' name='index'/>" +
                "<input type='submit' value='Create Event'>" +
                "</form>" +
                "</div>");
    }
}
