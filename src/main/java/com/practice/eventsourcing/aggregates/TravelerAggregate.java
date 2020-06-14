package com.practice.eventsourcing.aggregates;


import com.practice.eventsourcing.commands.CreateTravelerCommand;
import com.practice.eventsourcing.commands.RelocateTravelerCommand;
import com.practice.eventsourcing.events.*;
import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.commandhandling.model.AggregateIdentifier;
import org.axonframework.commandhandling.model.AggregateLifecycle;
import org.axonframework.eventsourcing.EventSourcingHandler;
import org.axonframework.eventsourcing.eventstore.EventStore;
import org.axonframework.spring.stereotype.Aggregate;
import org.springframework.beans.factory.annotation.Autowired;


@Aggregate
public class TravelerAggregate {

    @AggregateIdentifier
    private String id;

    private String name;

    private String currentLocation;

    private String status;

    public TravelerAggregate() {
    }

    @Autowired
    EventStore eventStore;

    @CommandHandler
    public TravelerAggregate(CreateTravelerCommand createTravelerCommand){
        AggregateLifecycle.apply(new TravelerCreatedEvent(createTravelerCommand.id,
                createTravelerCommand.getName(), createTravelerCommand.getBaseLocation()));
    }

    @EventSourcingHandler
    protected void on(TravelerCreatedEvent travelerCreatedEvent){
        this.id = travelerCreatedEvent.id;
        this.name = travelerCreatedEvent.getName();
        this.currentLocation = travelerCreatedEvent.getLocation();
        this.status = String.valueOf(Status.CREATED);
        AggregateLifecycle.apply(new TravelerActivatedEvent(this.id, Status.ACTIVATED));
    }

    @EventSourcingHandler
    protected void on(TravelerActivatedEvent travelerActivatedEvent){
        this.status = String.valueOf(travelerActivatedEvent.status);
    }

    @CommandHandler
    protected void on(RelocateTravelerCommand relocateTravelerCommand){
        AggregateLifecycle.apply(new TravelerRelocateEvent(relocateTravelerCommand.id, relocateTravelerCommand.getName(),
                relocateTravelerCommand.getShiftedLocation()));
    }

    @EventSourcingHandler
    protected void on(TravelerRelocateEvent travelerRelocateEvent){
        this.id = travelerRelocateEvent.id;
        this.name = travelerRelocateEvent.getName();
        this.currentLocation = travelerRelocateEvent.getLocation();
        AggregateLifecycle.apply(new TravelerShiftedEvent(this.id, Status.SHIFTED));
    }

    @EventSourcingHandler
    protected void on(TravelerShiftedEvent travelerShiftedEvent){
        this.status = String.valueOf(travelerShiftedEvent.status);
    }


}
