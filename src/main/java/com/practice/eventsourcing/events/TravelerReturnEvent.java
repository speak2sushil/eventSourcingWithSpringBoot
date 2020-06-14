package com.practice.eventsourcing.events;



public class TravelerReturnEvent extends BaseEvent<String> {

    private String name;

    private String location;

    public TravelerReturnEvent(String id, String name, String location) {
        super(id);
        this.name = name;
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
