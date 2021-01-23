package com.kodilla.stream;

import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.util.Map;
import java.util.stream.Collectors;


public class StreamMain {
    public static void main(String[] args) {

        Forum forum = new Forum();
        Map<Integer, ForumUser> theResultMapOfUsers = forum.getUserList().stream()
                .filter(user -> user.getSex() == 'M')
                .filter(user -> 2021 - user.getDateOfBirth().getYear() > 20)
                .filter(user -> user.getNumberOfPostsPublished() > 1)
                .collect(Collectors.toMap(ForumUser::getID, user -> user));

        theResultMapOfUsers.entrySet().stream()
                .map(entry -> "ID: [" + entry.getKey() + "] : " + entry.getValue())
                .forEach(System.out::println);


    }
}
