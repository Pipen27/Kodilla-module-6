package com.kodilla.good.patterns.challenges.flightSerach;

import java.util.HashMap;
import java.util.Map;

public class FlightList {

    private Map<Integer, Airport> flightList;

    public FlightList()
    {
        flightList = new HashMap<>();

        flightList.put(1,new Airport("KRAKOW", "GDANSK"));
        flightList.put(2,new Airport("KRAKOW", "WROCLAW"));
        flightList.put(3,new Airport("WROCLAW", "GDANSK"));
        flightList.put(4, new Airport("GDANSK","WARSZAWA"));
        flightList.put(5,new Airport("GDANSK","KRAKOW"));
        flightList.put(6,new Airport("RZESZOW","WARSZAWA"));
        flightList.put(7,new Airport("WARSZAWA","RZESZOW"));
        flightList.put(8,new Airport("KATOWICE","WARSZAWA"));
        flightList.put(9,new Airport("WARSZAWA","KATOWICE"));
        flightList.put(10,new Airport("GDANSK","POZNAN"));
        flightList.put(11,new Airport("POZNAN","WROCLAW"));
        flightList.put(12,new Airport("WROCLAW","KATOWICE"));

    }

    public Map<Integer, Airport> getFlightList() {
        return flightList;
    }
}
