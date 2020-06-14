package com.practice.eventsourcing.events;


import com.practice.eventsourcing.aggregates.Status;

public class TravelerShiftedEvent extends BaseEvent<String> {


    public final Status status;

    public TravelerShiftedEvent(String id, Status status) {
        super(id);
        this.status = status;
    }
}
