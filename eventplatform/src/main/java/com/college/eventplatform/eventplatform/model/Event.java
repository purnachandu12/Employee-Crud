package com.college.eventplatform.eventplatform.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Table(name="event")
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String description;
    private String category;
    private String venue;
    private LocalDateTime date;
    private String registrationLink;
    private boolean isPast;

    public Event() {}

    @Override
    public String toString() {
        return "Event{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", category='" + category + '\'' +
                ", venue='" + venue + '\'' +
                ", date=" + date +
                ", registrationLink='" + registrationLink + '\'' +
                ", isPast=" + isPast +
                '}';
    }
}
