package com.practice.eventsourcing.commands;

public class CreateTravelerCommand extends BaseCommand<String> {


    private String name;

    private String baseLocation;

    public CreateTravelerCommand(String id, String name, String baseLocation) {
        super(id);
        this.name = name;
        this.baseLocation = baseLocation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBaseLocation() {
        return baseLocation;
    }

    public void setBaseLocation(String baseLocation) {
        this.baseLocation = baseLocation;
    }

    @Override
    public String toString() {
        return "CreateTravelerCommand{" +
                "name='" + name + '\'' +
                ", baseLocation='" + baseLocation + '\'' +
                '}';
    }
}
