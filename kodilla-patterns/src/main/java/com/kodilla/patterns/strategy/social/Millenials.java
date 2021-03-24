package com.kodilla.patterns.strategy.social;

import com.kodilla.patterns.strategy.social.publisher.FacebookPublisher;

public class Millenials extends User {

    public Millenials(String userName) {
        super(userName);
        this.socialPublisher = new FacebookPublisher();
    }
}
