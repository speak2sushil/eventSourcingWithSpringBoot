package com.practice.eventsourcing.controllers;


import com.practice.eventsourcing.services.queries.TravelerQueryService;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/travelers")
@Api(value = "Traveler Queries", description = "Traveler Query Events Endpoint", tags = "Traveler Queries")
public class TravelerQueryController {

    private final TravelerQueryService travelerQueryService;

    public TravelerQueryController(TravelerQueryService travelerQueryService) {
        this.travelerQueryService = travelerQueryService;
    }

    @GetMapping("/{travelerId}/events")
    public List<Object> listEventsForTraveler(@PathVariable(value = "travelerId") String travelerId){
        return travelerQueryService.listEventsForTraveler(travelerId);
    }
}
