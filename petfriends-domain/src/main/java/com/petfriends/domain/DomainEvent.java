package com.petfriends.domain;

import java.time.LocalDateTime;

public abstract class DomainEvent {
    private final LocalDateTime occurredOn;

    public DomainEvent() {
        this.occurredOn = LocalDateTime.now();
    }

    public LocalDateTime getOccurredOn() {
        return occurredOn;
    }

    public abstract String getEventDetails();
}
