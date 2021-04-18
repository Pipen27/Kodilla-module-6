package com.kodilla.good.patterns.challenges.movie;

public class mainMovie {

    public static void main(String[] args) {

        MovieStore movieStore = new MovieStore();
        String show = movieStore.showAllMovies();
        System.out.println(show);
    }
}
