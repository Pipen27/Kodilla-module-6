package com.kodilla.patterns.builder.bigmac;

import java.util.ArrayList;
import java.util.List;

public final class Bigmac {
    private final Bun bun;
    private final Burgers burgers;
    private final Sauce sauce;
    private List<Ingredient> ingredients = new ArrayList<>();

    public static class BigmacBuilder {
        public  Bun bun;
        public Sauce sauce;
        public Burgers burgers;

        private List<Ingredient> ingredients = new ArrayList<>();

        public Bigmac.BigmacBuilder bun(Bun bun) {
            this.bun = bun;
            return this;
        }

        public Bigmac.BigmacBuilder burgers(Burgers burgers) {
            this.burgers = burgers;
            return this;
        }

        public Bigmac.BigmacBuilder sauce(Sauce sauce) {
            this.sauce = sauce;
            return this;
        }

        public Bigmac.BigmacBuilder ingredient(Ingredient ingredient) {
            ingredients.add(ingredient);
            return this;
        }

        public Bigmac build() {
            return new Bigmac(bun, burgers, sauce, ingredients);
        }
    }

    public Bigmac(Bun bun, Burgers burgers, Sauce sauce, List<Ingredient> ingredients) {
        this.bun = bun;
        this.burgers = burgers;
        this.sauce = sauce;
        this.ingredients = ingredients;
    }

    public Bun getBun() {
        return bun;
    }

    public Burgers getBurgers() {
        return burgers;
    }

    public Sauce getSauce() {
        return sauce;
    }

    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "bun='" + bun + '\'' +
                ", burgers='" + burgers + '\'' +
                ", sauce='" + sauce + '\'' +
                ", ingredients=" + ingredients +
                '}';
    }
}
