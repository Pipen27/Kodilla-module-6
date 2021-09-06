package com.kodilla.good.patterns.challenges.flightSerach;

import java.util.stream.Collectors;

public class SearchFlight {

    public FlightList searchFlightFrom(User user, FlightList flightList)
    {
        flightList.getFlightList().entrySet().stream()
                .map(e -> e.getValue())
                .filter(e -> e.getDepartureAirport().equals(user.getAirport().getDepartureAirport().toUpperCase()))
                .map(e -> "Departure from: " + e.getDepartureAirport() + " ---> " + "Arrival to: " + e.getArrivalAirport())
                .collect(Collectors.toList())
                .forEach(System.out::println);
        System.out.println();
            return flightList;

    }

    public FlightList searchFlightTo(User user, FlightList flightList)
    {
        flightList.getFlightList().entrySet().stream()
                .map(e -> e.getValue())
                .filter(e -> e.getArrivalAirport().equals(user.getAirport().getArrivalAirport().toUpperCase()))
                .map(e -> "Arrival to: " + e.getArrivalAirport() + " <--- " + "Departure from: " + e.getDepartureAirport())
                .collect(Collectors.toList())
                .forEach(System.out::println);
        System.out.println();
            return flightList;
    }

    public FlightList searchOneStopFlight(User user, FlightList flightList)
    {
        flightList.getFlightList().entrySet().stream()
                .map(e -> e.getValue())
                .filter(e -> e.getDepartureAirport().equals(user.getAirport().getDepartureAirport().toUpperCase()) && e.getArrivalAirport()
                        .equals(user.getOneStopConnection().toUpperCase()))
                .map(e -> "Departure from: " + e.getDepartureAirport() + " ---> " + "Arrival to (One stop Airport): " + e.getArrivalAirport())
                .collect(Collectors.toList())
                .forEach(System.out::println);

        flightList.getFlightList().entrySet().stream()
                .map(e -> e.getValue())
                .filter(e -> e.getDepartureAirport().equals(user.getOneStopConnection().toUpperCase()) && e.getArrivalAirport().equals(user.getAirport().getArrivalAirport().toUpperCase()))
                .map(e -> "Departure from (One stop Airport): " + e.getDepartureAirport() + " ---> " + "Arrival to: " + e.getArrivalAirport())
                .collect(Collectors.toList())
                .forEach(System.out::println);

        System.out.println();
            return flightList;
    }
}
