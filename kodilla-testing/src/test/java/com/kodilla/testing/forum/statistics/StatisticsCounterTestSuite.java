package com.kodilla.testing.forum.statistics;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@MockitoSettings(strictness = Strictness.LENIENT)
@ExtendWith(MockitoExtension.class)

public class StatisticsCounterTestSuite {


    private static int testCounter = 0;

    @BeforeAll
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterAll
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @BeforeEach
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Mock                                                   // przykladowe testy na wzor, TO DO
    private Statistics statisticsMock;


    private List<String> generateListOfNUsers(int usersQuantity) {
        List<String> resultList = new ArrayList<>();

        for (int n = 1; n <= usersQuantity; n++) {
            resultList.add("User" + n);
        }
        return resultList;
    }


    @Test
    void testListOfUsersEquals0() {

        // Given
        StatisticsCounter statisticsCounter = new StatisticsCounter(statisticsMock);

        List<String> resultListOfUsers = new ArrayList<>();

        when(statisticsMock.usersNames()).thenReturn(resultListOfUsers);

        // When
        List<String> theListOfUsers = statisticsCounter.usersNames(statisticsMock);

        // Then
        assertEquals(0, theListOfUsers.size());


    }

    @Test
    void testListOfUsersEquals100() {

        // Given
        StatisticsCounter statisticsCounter = new StatisticsCounter(statisticsMock);


        List<String> resultListOf100Users = generateListOfNUsers(100);

        System.out.println(statisticsCounter.numberOfUsers);


        when(statisticsMock.usersNames()).thenReturn(resultListOf100Users);

        // When
        List<String> theListOfUsers = statisticsCounter.usersNames(statisticsMock);

        // Then
        assertEquals(100, theListOfUsers.size());


    }

    @Test
    void testNumberOfPostsEquals0() {

        // Given
        StatisticsCounter statisticsCounter = new StatisticsCounter(statisticsMock);

        int resultNumberOfPosts = statisticsCounter.numberOfPosts; ;

        when(statisticsMock.postsCount()).thenReturn(resultNumberOfPosts);

        // When
       double theListOfUsers = statisticsCounter.postsCount(statisticsMock);

        // Then
        assertEquals(0, theListOfUsers);


    }

    @Test
    void testNumberOfPostsEquals1000() {

        // Given
        StatisticsCounter statisticsCounter = new StatisticsCounter(statisticsMock);

        int resultNumberOfPosts = statisticsCounter.numberOfPosts;
        resultNumberOfPosts = 1000;


        when(statisticsMock.postsCount()).thenReturn(resultNumberOfPosts);

        // When
        double theListOfUsers = statisticsCounter.postsCount(statisticsMock);

        // Then
        assertEquals(1000, theListOfUsers);



    }

    @Test
    void testNumberOfCommentsEquals0() {

        // Given
        StatisticsCounter statisticsCounter = new StatisticsCounter(statisticsMock);

        int resultNumberOfComments = statisticsCounter.numberOfComments; ;

        when(statisticsMock.postsCount()).thenReturn(resultNumberOfComments);

        // When
        double theListOfUsers = statisticsCounter.commentsCount(statisticsMock);

        // Then
        assertEquals(0, theListOfUsers);


    }

}
