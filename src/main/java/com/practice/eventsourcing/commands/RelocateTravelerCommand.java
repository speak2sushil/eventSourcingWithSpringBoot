package com.practice.eventsourcing.commands;

public class RelocateTravelerCommand extends BaseCommand<String> {


    private String name;

    private String shiftedLocation;

    public RelocateTravelerCommand(String id, String name, String shiftedLocation) {
        super(id);
        this.name = name;
        this.shiftedLocation = shiftedLocation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getShiftedLocation() {
        return shiftedLocation;
    }

    public void setShiftedLocation(String shiftedLocation) {
        this.shiftedLocation = shiftedLocation;
    }

    @Override
    public String toString() {
        return "RelocateTravelerCommand{" +
                "name='" + name + '\'' +
                ", shiftedLocation='" + shiftedLocation + '\'' +
                '}';
    }
}
