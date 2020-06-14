package com.practice.eventsourcing.services.commands;

import com.practice.eventsourcing.dto.commands.*;

import java.util.concurrent.CompletableFuture;

public interface TravelerCommandService {

    public CompletableFuture<String> createTraveler(TravelerCreateDTO travelerCreateDTO);
    public CompletableFuture<String> shiftTraveler(String accountNumber, TravelerRelocateDTO travelerRelocateDTO);
    public CompletableFuture<String> returnTraveler(String accountNumber, TravelerReturnDTO travelerReturnDTO);
}
