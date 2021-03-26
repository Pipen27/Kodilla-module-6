package com.kodilla.patterns.builder.bigmac;

public enum Ingredient {

    LETTUCE("lettuce"),
    ONION("onion"),
    BACON("bacon"),
    CHILI_PEPPERS("chili peppers"),
    MUSHROOMS("mushrooms"),
    PRAWNS("prawns"),
    CHEESE("cheese");

    private String ingredient;

    Ingredient(String ingredient) {
        this.ingredient = ingredient;
    }
}
