package com.kodilla.stream.world;

import java.util.HashSet;
import java.util.Set;

public final class Continent {

    private final String continentName;
    private final Set<Continent> continents = new HashSet<>();

    public Continent(final String continentName) {
        this.continentName = continentName;
    }

    public String getContinentName() {
        return continentName;
    }

    public Set<Continent> getContinents() {
        return continents;
    }
}
