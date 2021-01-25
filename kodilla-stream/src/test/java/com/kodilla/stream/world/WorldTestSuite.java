package com.kodilla.stream.world;

import com.kodilla.stream.forum.ForumUser;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

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

        Set<Country> continents = new HashSet<>();
        continents.add(country1);
        continents.add(country2);
        continents.add(country3);

        World world = new World(new BigDecimal("2999999997"));
        Set<Continent> worldList = new HashSet<>();
        worldList.add(continent1);
        worldList.add(continent2);

        //When

        BigDecimal expectedResult = new BigDecimal("2999999997");
        BigDecimal actual = world.getPeopleQuantity();

        //Then


        assertEquals(expectedResult, actual );

    }

}
