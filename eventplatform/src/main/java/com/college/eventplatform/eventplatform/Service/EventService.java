package com.college.eventplatform.eventplatform.Service;

import com.college.eventplatform.eventplatform.DAO.eventDaoimp;
import com.college.eventplatform.eventplatform.model.Event;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventService {

    eventDaoimp eventDaoimp;

    @Autowired
    public EventService(eventDaoimp eventDaoimp){
        this.eventDaoimp=eventDaoimp;
    }

    public void add_event(Event event){
        eventDaoimp.add_event(event);
    }

    public List<Event> find_all(){
        return eventDaoimp.findAll();
    }

    public Event findById(long id){
        return eventDaoimp.findById(id);
    }

    public List<Event> pastEvents(){
        return eventDaoimp.pastEvents();
    }

    public Event update(long id,Event event){
        return eventDaoimp.update(id,event);
    }

    public Event delete(long id){
        return eventDaoimp.delete(id);
    }

}
