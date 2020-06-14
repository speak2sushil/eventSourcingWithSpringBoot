package com.practice.eventsourcing.commands;

public class ReturnTravelerCommand extends BaseCommand<String> {


    private String name;

    private String location;

    public ReturnTravelerCommand(String id, String name, String location) {
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
        return "ReturnTravelerCommand{" +
                "name='" + name + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
}
