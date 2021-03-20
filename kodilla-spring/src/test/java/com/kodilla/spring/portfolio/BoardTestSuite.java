package com.kodilla.spring.portfolio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
public class BoardTestSuite {

    @Test
    void testTaskAdd() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);


        //When
        TaskList list1 = board.toDoList;
        boolean toDoListExist = context.containsBean("list1");

        TaskList list2 = board.inProgressList;
        boolean inProgressListExist = context.containsBean("list2");

        TaskList list3 = board.doneList;
        boolean doneListExist = context.containsBean("list3");
        //Then
        Assertions.assertEquals(true, toDoListExist);
        System.out.println("Bean toDoList was found in the container: " + toDoListExist);
        System.out.println(list1);

        Assertions.assertEquals(true, inProgressListExist);
        System.out.println("Bean inProgressList was found in the container: " + inProgressListExist);
        System.out.println(list2);

        Assertions.assertEquals(true, doneListExist);
        System.out.println("Bean doneList was found in the container: " + doneListExist);
        System.out.println(list3);
    }
}
