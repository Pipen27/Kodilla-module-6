package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

public final class Country {

    private final String countryName;
    private final BigDecimal peopleQuantity;
    private final Set<Country> countries = new HashSet<>();

    public Country(final String countryName, final BigDecimal peopleQuantity) {
        this.countryName = countryName;
        this.peopleQuantity = peopleQuantity;

    }

    public void addCountry (Country country) {
        countries.add(country);
    }

    public String getCountryName() {
        return countryName;
    }



   public BigDecimal getPeopleQuantity(){

       return peopleQuantity;
   }



    public Set<Country> getCountries() {
        return countries;
    }
}
