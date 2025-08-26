package com.college.eventplatform.eventplatform.Controller;


import com.college.eventplatform.eventplatform.Service.EventService;
import com.college.eventplatform.eventplatform.model.Event;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RestController
@RequestMapping("/api")
public class EventController {

    EventService eventservice;

    @Autowired
    public EventController(EventService eventservice){
        this.eventservice=eventservice;
    }

    @GetMapping("/events")
    public List<Event> get_events(){
        return eventservice.find_all();
    }

    @PostMapping("/events")
    public void add_events(@RequestBody Event event){
        eventservice.add_event(event);
    }

    @GetMapping("/events/{id}")
    public Event find_event(@PathVariable long id){
        return eventservice.findById(id);
    }

    @PutMapping("/events/{id}")
    public Event update(@PathVariable long id,@RequestBody Event event){
        return eventservice.update(id,event);
    }

    @DeleteMapping("/events/{id}")
    public Event delete(@PathVariable long id){
        return eventservice.delete(id);
    }

    @GetMapping("/events/past")
    public List<Event> past_events(){
        return eventservice.pastEvents();
    }

}
