package com.practice.eventsourcing.services.queries;

import org.axonframework.eventsourcing.eventstore.EventStore;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TravelerQueryServiceImpl implements TravelerQueryService {

    private final EventStore eventStore;

    public TravelerQueryServiceImpl(EventStore eventStore) {
        this.eventStore = eventStore;
    }

    @Override
    public List<Object> listEventsForTraveler(String travelerId) {
        return eventStore.readEvents(travelerId).asStream().map( s -> s.getPayload()).collect(Collectors.toList());
    }
}
