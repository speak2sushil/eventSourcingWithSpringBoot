package com.practice.eventsourcing.events;


import com.practice.eventsourcing.aggregates.Status;

public class TravelerActivatedEvent extends BaseEvent<String> {


    public final Status status;

    public TravelerActivatedEvent(String id, Status status) {
        super(id);
        this.status = status;
    }
}
