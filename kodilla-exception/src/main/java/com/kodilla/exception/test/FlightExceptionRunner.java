package com.kodilla.exception.test;

public class FlightExceptionRunner {

    public static void main(String[] args) throws RouteNotFoundException {
        Flight flight1 = new Flight("Moscow", "Warsaw");
        Flight flight2 = new Flight("Warsaw", "Moscow");
        Flight flight3 = new Flight("Madrid", "Berlin");
        Flight flight4 = new Flight("Madrid", "Turin");

        FlightSearcher flightSearcher = new FlightSearcher();

        try {
            boolean first = flightSearcher.findFlight(flight1);
            System.out.println(first);
        }catch (RouteNotFoundException e) {
            System.out.println("Flight is not possible to reach!");
        }

        try {
            boolean second = flightSearcher.findFlight(flight2);
            System.out.println(second);
        }catch (RouteNotFoundException e) {
            System.out.println("Flight is not possible to reach!");
        }

        try {
            boolean third = flightSearcher.findFlight(flight3);
            System.out.println(third);
        }catch (RouteNotFoundException e) {
            System.out.println("Flight is not possible to reach!");
        }

        try {
            boolean fourth = flightSearcher.findFlight(flight4);
            System.out.println(fourth);
        }catch (RouteNotFoundException e) {
            System.out.println("Flight is not possible to reach!");
        }


    }
}
