package com.kodilla.testing.forum.statistics;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import java.util.ArrayList;
import java.util.List;
import java.lang.ArithmeticException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@MockitoSettings(strictness = Strictness.LENIENT)
@ExtendWith(MockitoExtension.class)


@Nested
@DisplayName("Tests for Forum statistics")
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

    @Mock
    private Statistics statisticsMock;


    private List<String> generateListOfNUsers(int usersQuantity) {
        List<String> resultList = new ArrayList<>();

        for (int n = 1; n <= usersQuantity; n++) {
            resultList.add("User" + n);
        }
        return resultList;
    }





    @Test
    void testNumberOfPostsEquals0() {

        // Given
        StatisticsCounter statisticsCounter = new StatisticsCounter(statisticsMock);

        int resultNumberOfPosts = 0 ;
        int resultNumberOfComments = 100;

        List<String> resultListOf100Users = generateListOfNUsers(100);
        int resultNumberOfUsers = resultListOf100Users.size();

        when(statisticsMock.postsCount()).thenReturn(resultNumberOfPosts);
        when(statisticsMock.commentsCount()).thenReturn(resultNumberOfComments);
        when(statisticsMock.usersNames()).thenReturn(resultListOf100Users);
        // When
        statisticsCounter.calculateAdvStatistics(statisticsMock);
        double expectedAverageNumberOfPostsPerUser = resultNumberOfPosts/resultNumberOfUsers;
        double expectedAverageNumberOfCommentsPerUser = resultNumberOfComments/resultNumberOfUsers;

        // Then
        assertEquals(expectedAverageNumberOfPostsPerUser, statisticsCounter.getAverageNumberOfPostsPerUser());
        assertEquals(0, statisticsCounter.getAverageNumberOfCommentsPerPost());
        assertEquals(expectedAverageNumberOfCommentsPerUser, statisticsCounter.getAverageNumberOfCommentsPerUser());
    }

    @Test
    void testNumberOfPostsEquals1000() {

        // Given
        StatisticsCounter statisticsCounter = new StatisticsCounter(statisticsMock);

        int resultNumberOfPosts = 1000 ;
        int resultNumberOfComments = 900;

        List<String> resultListOf100Users = generateListOfNUsers(100);
        int resultNumberOfUsers = resultListOf100Users.size();

        when(statisticsMock.postsCount()).thenReturn(resultNumberOfPosts);
        when(statisticsMock.commentsCount()).thenReturn(resultNumberOfComments);
        when(statisticsMock.usersNames()).thenReturn(resultListOf100Users);
        // When
        statisticsCounter.calculateAdvStatistics(statisticsMock);
        double expectedAverageNumberOfPostsPerUser = resultNumberOfPosts/resultNumberOfUsers;
        double expectedAverageNumberOfCommentsPerPost = resultNumberOfComments/resultNumberOfPosts;
        double expectedAverageNumberOfCommentsPerUser = resultNumberOfComments/resultNumberOfUsers;


        // Then
        assertEquals(expectedAverageNumberOfPostsPerUser, statisticsCounter.getAverageNumberOfPostsPerUser());
        assertEquals(expectedAverageNumberOfCommentsPerPost, statisticsCounter.getAverageNumberOfCommentsPerPost());
        assertEquals(expectedAverageNumberOfCommentsPerUser, statisticsCounter.getAverageNumberOfCommentsPerUser());
    }

    @Test
    void testNumberOfCommentsEquals0() {

        // Given
        StatisticsCounter statisticsCounter = new StatisticsCounter(statisticsMock);

        int resultNumberOfPosts = 1000 ;
        int resultNumberOfComments = 0;

        List<String> resultListOf100Users = generateListOfNUsers(100);
        int resultNumberOfUsers = resultListOf100Users.size();

        when(statisticsMock.postsCount()).thenReturn(resultNumberOfPosts);
        when(statisticsMock.commentsCount()).thenReturn(resultNumberOfComments);
        when(statisticsMock.usersNames()).thenReturn(resultListOf100Users);
        // When
        statisticsCounter.calculateAdvStatistics(statisticsMock);
        double expectedAverageNumberOfPostsPerUser = resultNumberOfPosts/resultNumberOfUsers;
        double expectedAverageNumberOfCommentsPerPost = resultNumberOfComments/resultNumberOfPosts;
        double expectedAverageNumberOfCommentsPerUser = resultNumberOfComments/resultNumberOfUsers;


        // Then
        assertEquals(expectedAverageNumberOfPostsPerUser, statisticsCounter.getAverageNumberOfPostsPerUser());
        assertEquals(expectedAverageNumberOfCommentsPerPost, statisticsCounter.getAverageNumberOfCommentsPerPost());
        assertEquals(expectedAverageNumberOfCommentsPerUser, statisticsCounter.getAverageNumberOfCommentsPerUser());
    }

    @Test
    void testNumberOfCommentsSmallerThanPosts() {

        // Given
        StatisticsCounter statisticsCounter = new StatisticsCounter(statisticsMock);

        int resultNumberOfPosts = 1000 ;
        int resultNumberOfComments = 666;

        List<String> resultListOf100Users = generateListOfNUsers(100);
        int resultNumberOfUsers = resultListOf100Users.size();

        when(statisticsMock.postsCount()).thenReturn(resultNumberOfPosts);
        when(statisticsMock.commentsCount()).thenReturn(resultNumberOfComments);
        when(statisticsMock.usersNames()).thenReturn(resultListOf100Users);
        // When
        statisticsCounter.calculateAdvStatistics(statisticsMock);
        double expectedAverageNumberOfPostsPerUser = resultNumberOfPosts/resultNumberOfUsers;
        double expectedAverageNumberOfCommentsPerPost = resultNumberOfComments/resultNumberOfPosts;
        double expectedAverageNumberOfCommentsPerUser = resultNumberOfComments/resultNumberOfUsers;


        // Then
        assertEquals(expectedAverageNumberOfPostsPerUser, statisticsCounter.getAverageNumberOfPostsPerUser());
        assertEquals(expectedAverageNumberOfCommentsPerPost, statisticsCounter.getAverageNumberOfCommentsPerPost());
        assertEquals(expectedAverageNumberOfCommentsPerUser, statisticsCounter.getAverageNumberOfCommentsPerUser());
    }

    @Test
    void testNumberOfCommentsGreaterThanPosts() {

        // Given
        StatisticsCounter statisticsCounter = new StatisticsCounter(statisticsMock);

        int resultNumberOfPosts = 1000 ;
        int resultNumberOfComments = 1666;

        List<String> resultListOf100Users = generateListOfNUsers(100);
        int resultNumberOfUsers = resultListOf100Users.size();

        when(statisticsMock.postsCount()).thenReturn(resultNumberOfPosts);
        when(statisticsMock.commentsCount()).thenReturn(resultNumberOfComments);
        when(statisticsMock.usersNames()).thenReturn(resultListOf100Users);
        // When
        statisticsCounter.calculateAdvStatistics(statisticsMock);
        double expectedAverageNumberOfPostsPerUser = resultNumberOfPosts/resultNumberOfUsers;
        double expectedAverageNumberOfCommentsPerPost = resultNumberOfComments/resultNumberOfPosts;
        double expectedAverageNumberOfCommentsPerUser = resultNumberOfComments/resultNumberOfUsers;


        // Then
        assertEquals(expectedAverageNumberOfPostsPerUser, statisticsCounter.getAverageNumberOfPostsPerUser());
        assertEquals(expectedAverageNumberOfCommentsPerPost, statisticsCounter.getAverageNumberOfCommentsPerPost());
        assertEquals(expectedAverageNumberOfCommentsPerUser, statisticsCounter.getAverageNumberOfCommentsPerUser());
    }




    @Test
    void testListOfUsersEquals0() {



            // Given
            StatisticsCounter statisticsCounter = new StatisticsCounter(statisticsMock);

            int resultNumberOfPosts = 1000 ;
            int resultNumberOfComments = 1666;

            List<String> resultListOf0Users = generateListOfNUsers(0);
            int resultNumberOfUsers = resultListOf0Users.size();

            when(statisticsMock.postsCount()).thenReturn(resultNumberOfPosts);
            when(statisticsMock.commentsCount()).thenReturn(resultNumberOfComments);
            when(statisticsMock.usersNames()).thenReturn(resultListOf0Users);
            // When
            statisticsCounter.calculateAdvStatistics(statisticsMock);
            double expectedAverageNumberOfCommentsPerPost = resultNumberOfComments/resultNumberOfPosts;



            // Then
            assertEquals(0, statisticsCounter.getAverageNumberOfPostsPerUser());
            assertEquals(expectedAverageNumberOfCommentsPerPost, statisticsCounter.getAverageNumberOfCommentsPerPost());
            assertEquals(0, statisticsCounter.getAverageNumberOfCommentsPerUser());
        }


    @Test
    void testListOfUsersEquals100() {

        // Given
        StatisticsCounter statisticsCounter = new StatisticsCounter(statisticsMock);

        int resultNumberOfPosts = 1000 ;
        int resultNumberOfComments = 1666;

        List<String> resultListOf100Users = generateListOfNUsers(100);
        int resultNumberOfUsers = resultListOf100Users.size();

        when(statisticsMock.postsCount()).thenReturn(resultNumberOfPosts);
        when(statisticsMock.commentsCount()).thenReturn(resultNumberOfComments);
        when(statisticsMock.usersNames()).thenReturn(resultListOf100Users);
        // When
        statisticsCounter.calculateAdvStatistics(statisticsMock);
        double expectedAverageNumberOfPostsPerUser = resultNumberOfPosts/resultNumberOfUsers;
        double expectedAverageNumberOfCommentsPerPost = resultNumberOfComments/resultNumberOfPosts;
        double expectedAverageNumberOfCommentsPerUser = resultNumberOfComments/resultNumberOfUsers;



        // Then
        assertEquals(expectedAverageNumberOfPostsPerUser, statisticsCounter.getAverageNumberOfPostsPerUser());
        assertEquals(expectedAverageNumberOfCommentsPerPost, statisticsCounter.getAverageNumberOfCommentsPerPost());
        assertEquals(expectedAverageNumberOfCommentsPerUser, statisticsCounter.getAverageNumberOfCommentsPerUser());
    }

}
