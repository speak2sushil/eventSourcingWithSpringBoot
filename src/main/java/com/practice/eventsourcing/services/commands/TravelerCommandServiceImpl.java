package com.practice.eventsourcing.services.commands;

import com.practice.eventsourcing.commands.*;
import com.practice.eventsourcing.dto.commands.*;
import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.stereotype.Service;

import java.util.UUID;
import java.util.concurrent.CompletableFuture;

@Service
public class TravelerCommandServiceImpl implements TravelerCommandService {

    private final CommandGateway commandGateway;

    public TravelerCommandServiceImpl(CommandGateway commandGateway) {
        this.commandGateway = commandGateway;
    }

    @Override
    public CompletableFuture<String> createTraveler(TravelerCreateDTO travelerCreateDTO) {
        return commandGateway.send(new CreateTravelerCommand(UUID.randomUUID().toString(), travelerCreateDTO.getName(), travelerCreateDTO.getLocation()));
    }

    @Override
    public CompletableFuture<String> shiftTraveler(String accountNumber, TravelerRelocateDTO travelerRelocateDTO) {
        return commandGateway.send(new RelocateTravelerCommand(accountNumber, travelerRelocateDTO.getName(), travelerRelocateDTO.getLocation()));
    }

    @Override
    public CompletableFuture<String> returnTraveler(String accountNumber, TravelerReturnDTO travelerReturnDTO) {
        return commandGateway.send(new ReturnTravelerCommand(accountNumber, travelerReturnDTO.getName(), travelerReturnDTO.getLocation()));
    }


}
