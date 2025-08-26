package com.college.eventplatform.eventplatform.DAO;

import com.college.eventplatform.eventplatform.model.Event;

import java.util.List;

public interface eventdao {
    List<Event> findAll();
    void add_event(Event event);
    Event findById(long id);

    Event update(long id, Event updatedEvent);

    Event delete(long id);
    List<Event> pastEvents();
}

