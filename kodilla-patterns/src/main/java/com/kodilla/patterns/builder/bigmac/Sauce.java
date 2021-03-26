package com.kodilla.patterns.builder.bigmac;

public enum Sauce {

    STANDARD("standard"),
    THOUSAND_ISLANDS("1000 islands"),
    BARBECUE("barbecue");

    private String kindOfSauce;

    Sauce(String kindOfSauce) {
        this.kindOfSauce = kindOfSauce;
    }

    public String getKindOfSauce(Sauce kind) {
        return kindOfSauce;
    }
}
