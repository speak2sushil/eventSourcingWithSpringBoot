package com.practice.eventsourcing.controllers;

import com.practice.eventsourcing.dto.commands.*;
import com.practice.eventsourcing.services.commands.TravelerCommandService;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.CompletableFuture;

@RestController
@RequestMapping(value = "/travelers")
@Api(value = "Traveler Commands", description = "Traveler Commands Related Endpoints", tags = "Traveler Commands")
public class TravelerCommandController {

    private final TravelerCommandService travelerCommandService;

    public TravelerCommandController(TravelerCommandService travelerCommandService) {
        this.travelerCommandService = travelerCommandService;
    }

    @PostMapping
    public CompletableFuture<String> createTraveler(@RequestBody TravelerCreateDTO travelerCreateDTO){
        return travelerCommandService.createTraveler(travelerCreateDTO);
    }

    @PutMapping(value = "/shift/{travelerId}")
    public CompletableFuture<String> shiftTraveler(@PathVariable(value = "travelerId") String travelerId,
                                                          @RequestBody TravelerRelocateDTO travelerRelocateDTO){
        return travelerCommandService.shiftTraveler(travelerId,travelerRelocateDTO);
    }



}
