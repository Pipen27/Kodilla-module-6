package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public final class World {

    private final BigDecimal peopleQuantityWorld;
    private final Set<Continent> worldList = new HashSet<>();


    public World(final BigDecimal peopleQuantityWorld) {
        this.peopleQuantityWorld = peopleQuantityWorld;
    }

    public Set<Continent> getWorld(){return new HashSet<>(worldList);}

    public void addContinent(Continent continent) {
        worldList.add(continent);
    }

    public  BigDecimal getPeopleQuantity(){

        return worldList.stream()
                .map(continent -> continent.getContinents())
                .flatMap(continent -> continent.stream())
                .map(Country::getPeopleQuantity)
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));

    }
}
