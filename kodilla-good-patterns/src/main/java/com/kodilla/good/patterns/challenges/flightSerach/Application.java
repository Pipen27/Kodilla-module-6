package com.kodilla.good.patterns.challenges.flightSerach;

public class Application {

    public static void main(String[] args) {

        FlightList flightList = new FlightList();
        User user = new User("Jan", "Nowak", new Airport("Gdansk","Wroclaw"),"Krakow");

        SearchFlight searchFlight = new SearchFlight();
        searchFlight.searchFlightFrom(user, flightList);
        searchFlight.searchFlightTo(user, flightList);
        searchFlight.searchOneStopFlight(user, flightList);
    }
}
