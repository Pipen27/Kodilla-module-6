package com.kodilla.good.patterns.challenges.flightSerach;

public class SearchFlight {

    public void searchFlightFrom(User user, FlightList flightList)
    {
        flightList.getFlightList().entrySet().stream()
                .map(e -> e.getValue())
                .filter(e -> e.getDepartureAirport().equals(user.getAirport().getDepartureAirport().toUpperCase()))
                .map(e -> "Departure from: " + e.getDepartureAirport() + " ---> " + "Arrival to: " + e.getArrivalAirport())
                .forEach(System.out::println);
        System.out.println();
    }

    public void searchFlightTo(User user, FlightList flightList)
    {
        flightList.getFlightList().entrySet().stream()
                .map(e -> e.getValue())
                .filter(e -> e.getArrivalAirport().equals(user.getAirport().getArrivalAirport().toUpperCase()))
                .map(e -> "Arrival to: " + e.getArrivalAirport() + " <--- " + "Departure from: " + e.getDepartureAirport())
                .forEach(System.out::println);
        System.out.println();
    }

    public void searchOneStopFlight(User user, FlightList flightList)
    {
        flightList.getFlightList().entrySet().stream()
                .map(e -> e.getValue())
                .filter(e -> e.getDepartureAirport().equals(user.getAirport().getDepartureAirport().toUpperCase()) || e.getArrivalAirport()
                        .equals(user.getAirport().getArrivalAirport().toUpperCase()))
                .filter(e -> e.getDepartureAirport().equals(user.getOneStopConnection().toUpperCase()) || e.getArrivalAirport().equals(user.getOneStopConnection().toUpperCase()))
                .map(e -> "Departure from: " + e.getDepartureAirport() + " ---> " + "Arrival to: " + e.getArrivalAirport())
                .forEach(System.out::println);
    }
}
