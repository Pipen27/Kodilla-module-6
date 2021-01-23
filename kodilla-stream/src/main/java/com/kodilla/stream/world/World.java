package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public final class World {

    private final BigDecimal peopleQuantityWorld;
    private final Set<Continent> world = new HashSet<>();

    public World(final BigDecimal peopleQuantityWorld) {
        this.peopleQuantityWorld = peopleQuantityWorld;
    }

    public BigDecimal getPeopleQuantity(){

        return peopleQuantityWorld.stream()
                .flatMap(continent -> continent.getContinents().stream())
                .flatMap(country -> country.getCountries().stream())
                .filter(country -> country != this)
                .map(Country::getPeopleQuantity)
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));

    }
}
