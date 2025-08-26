package com.college.eventplatform.eventplatform.DAO;

import com.college.eventplatform.eventplatform.model.Event;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityNotFoundException;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Repository
@Transactional
public class eventDaoimp implements eventdao{

    EntityManager entityManager;

    @Autowired
    public eventDaoimp(EntityManager entityManager){
        this.entityManager=entityManager;
    }

    @Override
    public List<Event> findAll() {
        TypedQuery<Event> query=entityManager.createQuery("from Event",Event.class);
        List<Event> list=query.getResultList();
        return list;
    }

    @Override
    public void add_event(Event event) {
        entityManager.persist(event);
    }

    @Override
    public Event findById(long id) {
        return entityManager.find(Event.class,id);
    }

    @Override
    public Event update(long id, Event updatedEvent) {
        Event existingEvent = findById(id);
        if (existingEvent == null) {
            throw new EntityNotFoundException("Event with ID " + id + " not found");
        }

        // Update fields manually
        existingEvent.setTitle(updatedEvent.getTitle());
        existingEvent.setDescription(updatedEvent.getDescription());
        existingEvent.setCategory(updatedEvent.getCategory());
        existingEvent.setVenue(updatedEvent.getVenue());
        existingEvent.setDate(updatedEvent.getDate());
        existingEvent.setRegistrationLink(updatedEvent.getRegistrationLink());
        existingEvent.setPast(updatedEvent.isPast());

        return entityManager.merge(existingEvent);
    }

    @Override
    public Event delete(long id){
        Event event=findById(id);
        entityManager.remove(event);
        return event;
    }

    @Override
    public List<Event> pastEvents(){
        List<Event> past=new ArrayList<>();
        ArrayList<Event> temp = new ArrayList<>(findAll());

        for (Event event : temp) {
            if (event.isPast()) {
                past.add(event);
            }
        }
        return past;
    }

}
