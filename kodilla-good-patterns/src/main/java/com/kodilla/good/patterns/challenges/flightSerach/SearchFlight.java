package com.kodilla.good.patterns.challenges.flightSerach;

import java.util.Map;
import java.util.stream.Collectors;

public class SearchFlight {

    public Map<Integer, Airport> searchFlightFrom(User user, FlightList flightList)
    {

        Map<Integer, Airport> collectFrom = flightList.getFlightList().entrySet().stream()
                .filter(e -> e.getValue().getDepartureAirport().equals(user.getAirport().getDepartureAirport().toUpperCase()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

        return collectFrom;


    }

    public Map<Integer, Airport> searchFlightTo(User user, FlightList flightList)
    {
        Map<Integer, Airport> collectTo = flightList.getFlightList().entrySet().stream()
                .filter(e -> e.getValue().getArrivalAirport().equals(user.getAirport().getArrivalAirport().toUpperCase()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

        return collectTo;
    }

    public Map<Integer, Airport> searchOneStopFlight(User user, FlightList flightList) {


        Map<Integer, Airport> collectOneStop = flightList.getFlightList().entrySet().stream()
                .filter(e -> e.getValue().getDepartureAirport().equals(user.getAirport().getDepartureAirport().toUpperCase()) && e.getValue().getArrivalAirport()
                        .equals(user.getOneStopConnection().toUpperCase()))
                .filter(e -> e.getValue().getDepartureAirport().equals(user.getOneStopConnection().toUpperCase()) && e.getValue().getArrivalAirport().equals(user.getAirport().getArrivalAirport().toUpperCase()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

            return collectOneStop;
    }
}
