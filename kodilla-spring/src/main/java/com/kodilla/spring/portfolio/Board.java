package com.kodilla.spring.portfolio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Board {

    @Autowired
    @Qualifier("list1")
    TaskList toDoList;
    @Autowired
    @Qualifier("list2")
    TaskList inProgressList;
    @Autowired
    @Qualifier("list3")
    TaskList doneList;

}
