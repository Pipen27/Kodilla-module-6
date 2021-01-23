package com.kodilla.testing.forum.statistics;

import java.util.ArrayList;
import java.util.List;

public class StatisticsCounter {

    private Statistics statistics;

    int numberOfUsers;
    int numberOfPosts;
    int numberOfComments;
    double averageNumberOfPostsPerUser;
    double averageNumberOfCommentsPerUser;
    double averageNumberOfCommentsPerPost;

    public StatisticsCounter(Statistics statistics) {
        this.statistics = statistics;
    }

    List<String> usersNames(Statistics statistics){
        List<String> listOfUsers = new ArrayList<String>();
        List<String> resultList = statistics
                .usersNames();
        listOfUsers = resultList;


        return listOfUsers;


    }


    int postsCount(Statistics statistics){
        int sumPosts = 0;
        int resultList = statistics.
                postsCount();
        sumPosts += resultList;

        return sumPosts;
    }


    int commentsCount(Statistics statistics){

        int sumComments = 0;
        int resultList = statistics.
                commentsCount();
        sumComments += resultList;

        return sumComments;



    }

    void calculateAdvStatistics (Statistics statistics){

        int resultList1 = statistics
                .usersNames().size();



        int resultList2 = statistics
                .postsCount();


        int resultList3 = statistics
                .commentsCount();


       averageNumberOfPostsPerUser = (resultList2) / ( resultList1);
       averageNumberOfCommentsPerUser = (resultList3) / ( resultList1);
       averageNumberOfCommentsPerPost = ( resultList3) / ( resultList2);





    }

    public Statistics getStatistics() {
        return statistics;
    }

    public int getNumberOfUsers() {
        return numberOfUsers;
    }

    public int getNumberOfPosts() {
        return numberOfPosts;
    }

    public int getNumberOfComments() {
        return numberOfComments;
    }

    public double getAverageNumberOfPostsPerUser() {
        return averageNumberOfPostsPerUser;
    }

    public double getAverageNumberOfCommentsPerUser() {
        return averageNumberOfCommentsPerUser;
    }

    public double getAverageNumberOfCommentsPerPost() {
        return averageNumberOfCommentsPerPost;
    }
}
