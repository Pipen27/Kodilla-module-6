package com.kodilla.stream.world;

import com.kodilla.stream.forum.ForumUser;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

public class WorldTestSuite {

    @Test
    void testGetPeopleQuantity() {
        //Given
        //Create users
       Country country1 = new Country("Spain",new BigDecimal(999999999));
        Country country2 = new Country("Poland", new BigDecimal(999999999));
        Country country3 = new Country("China", new BigDecimal(999999999));



        Continent continent1 = new Continent("Europe");
        Continent continent2 = new Continent("Asia");

        World world = new World(new BigDecimal("2999999997"));

        //When

        BigDecimal expectedResult = new BigDecimal("2999999997");
        BigDecimal actual = world.getPeopleQuantity();

        //Then


        assertEquals(expectedResult, actual );

    }

}
