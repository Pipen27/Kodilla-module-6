package com.kodilla.patterns.strategy.social;

import com.kodilla.patterns.strategy.social.publisher.TwitterPublisher;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTestSuite {

    @Test
    void testDefaultSharingStrategies() {
        //Given
        User steven = new Millenials("Steven12");
        User john = new YGeneration("JoRay7");
        User tonny = new ZGeneration("KonnyKingD");

        //When
        String steven_s_publisher = steven.sharePost();
        System.out.println(steven.getUserName() + " like to post on " + steven_s_publisher);
        String john_s_publisher = john.sharePost();
        System.out.println(john.getUserName() + " like to post on " + john_s_publisher);
        String tonny_s_publisher = tonny.sharePost();
        System.out.println(tonny.getUserName() + " like to post on " + tonny_s_publisher);

        //Then
        assertEquals("Facebook", steven_s_publisher);
        assertEquals("Twitter", john_s_publisher);
        assertEquals("Snapchat", tonny_s_publisher);
    }

    @Test
    void testIndividualSharingStrategy() {
        //Given
        User steven = new Millenials("Steven Links");

        //When
        String steven_s_publisher = steven.sharePost();
        System.out.println(steven.getUserName() + " like to post on " + steven_s_publisher);
        steven.setSocialPublisher(new TwitterPublisher());
        steven_s_publisher = steven.sharePost();
        System.out.println(steven.getUserName() + " from today like to post on " + steven_s_publisher);

        //Then
        assertEquals("Twitter", steven_s_publisher);
    }
}
