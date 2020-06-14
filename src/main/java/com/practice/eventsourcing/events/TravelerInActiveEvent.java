package com.practice.eventsourcing.events;


import com.practice.eventsourcing.aggregates.Status;

public class TravelerInActiveEvent extends BaseEvent<String> {


    public final Status status;

    public TravelerInActiveEvent(String id, Status status) {
        super(id);
        this.status = status;
    }
}
