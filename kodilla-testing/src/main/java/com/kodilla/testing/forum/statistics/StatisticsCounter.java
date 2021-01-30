package com.kodilla.testing.forum.statistics;

import java.util.ArrayList;
import java.util.List;
import java.lang.ArithmeticException;

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
    int usersCount(Statistics statistics){
        int sumUsers = 0;
        int resultList = statistics.
                usersNames().size();
        sumUsers += resultList;

        return sumUsers;
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


        try{

            averageNumberOfPostsPerUser = (resultList2) / ( resultList1);

            if (averageNumberOfPostsPerUser == Double.POSITIVE_INFINITY){
            throw new ArithmeticException("Not finite");}
        }
            catch (ArithmeticException e){
                System.err.println("You can't divide by 0");
            }

        try{
            averageNumberOfCommentsPerUser = (resultList3) / ( resultList1);

            if (averageNumberOfCommentsPerUser == Double.POSITIVE_INFINITY){
                throw new ArithmeticException("Not finite");}
        }
            catch (ArithmeticException e){
                System.err.println("You can't divide by 0");
            }
        try{
            averageNumberOfCommentsPerPost = ( resultList3) / ( resultList2);

            if (averageNumberOfCommentsPerPost == Double.POSITIVE_INFINITY){
                throw new ArithmeticException("Not finite");
            }

        }
            catch (ArithmeticException e){
        System.err.println("You can't divide by 0");
            }



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


             if (averageNumberOfPostsPerUser == Double.POSITIVE_INFINITY){
                  throw new ArithmeticException("Not finite");


             }
             else
             return averageNumberOfPostsPerUser;

    }

    public double getAverageNumberOfCommentsPerUser() {


        if (averageNumberOfCommentsPerUser == Double.POSITIVE_INFINITY) {
            throw new ArithmeticException("Not finite");
        }
        else
            return averageNumberOfCommentsPerUser;

    }

    public double getAverageNumberOfCommentsPerPost() {

        if (averageNumberOfCommentsPerPost == Double.POSITIVE_INFINITY){
            throw new ArithmeticException("Not finite");}
        else
            return averageNumberOfCommentsPerPost;

    }
}
