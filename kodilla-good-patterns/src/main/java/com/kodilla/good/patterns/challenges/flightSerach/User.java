package com.kodilla.good.patterns.challenges.flightSerach;

public class User {

    private String name;
    private String surname;
    private Airport airport;
    private String oneStopConnection;

    public User(String name, String surname, Airport airport, String oneStopConnection) {
        this.name = name;
        this.surname = surname;
        this.airport = airport;
        this.oneStopConnection = oneStopConnection;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Airport getAirport() {
        return airport;
    }

    public String getOneStopConnection() {
        return oneStopConnection;
    }
}
