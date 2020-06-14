package com.practice.eventsourcing.events;


public class TravelerCreatedEvent extends BaseEvent<String> {


    private String name;

    private String location;

    public TravelerCreatedEvent(String id, String name,String location) {
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

    @Override
    public String toString() {
        return "TravelerCreatedEvent{" +
                "name='" + name + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
}
