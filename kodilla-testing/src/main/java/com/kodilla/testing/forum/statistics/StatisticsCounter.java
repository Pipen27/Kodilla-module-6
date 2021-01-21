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


    int commentsCount(){

        int sumComments = 0;
        int resultList = statistics.
                commentsCount();
        sumComments += resultList;

        return sumComments;



    }

    Object calculateAdvStatistics (Statistics statistics){

        int resultList1 = statistics
                .usersNames().size();
        numberOfUsers += resultList1;


        int resultList2 = statistics
                .postsCount();
        numberOfPosts += resultList2;

        int resultList3 = statistics
                .commentsCount();
        numberOfComments += resultList3;

       averageNumberOfPostsPerUser = (numberOfPosts += resultList2) / (numberOfUsers += resultList1);
       averageNumberOfCommentsPerUser = (numberOfComments += resultList3) / (numberOfUsers += resultList1);
       averageNumberOfCommentsPerPost = (numberOfComments += resultList3) / (numberOfPosts += resultList2);




        return  numberOfUsers + ", " + numberOfPosts + ", " + numberOfComments +
                ", " + averageNumberOfPostsPerUser + ", " + averageNumberOfCommentsPerUser +
                ", " + averageNumberOfCommentsPerPost;
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
