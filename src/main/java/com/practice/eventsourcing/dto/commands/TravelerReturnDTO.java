package com.practice.eventsourcing.dto.commands;

public class TravelerReturnDTO {

    private String name;

    private String location;

    @Override
    public String toString() {
        return "TravelerReturnDTO{" +
                "name='" + name + '\'' +
                ", location='" + location + '\'' +
                '}';
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
