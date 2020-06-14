package com.practice.eventsourcing.services.queries;

import java.util.List;

public interface TravelerQueryService {
    public List<Object> listEventsForTraveler(String travelerId);
}
