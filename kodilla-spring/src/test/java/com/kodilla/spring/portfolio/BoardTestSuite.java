package com.kodilla.spring.portfolio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

@SpringBootTest
public class BoardTestSuite {

    @Test
    void testTaskAdd() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);

        List<String> toDoListTasks = board.toDoList.getTasks();
        toDoListTasks.add("task1 to do list");

        List<String> inProgressListTasks = board.inProgressList.getTasks();
        inProgressListTasks.add("task1 in progress list");

        List<String> doneListTasks = board.doneList.getTasks();
        doneListTasks.add("task1 done list");

        //When
        String result1 = toDoListTasks.get(0);
        boolean toDoListExist = context.containsBean("list1");


        String result2 = inProgressListTasks.get(0);
        boolean inProgressListExist = context.containsBean("list2");

        String result3 = doneListTasks.get(0);
        boolean doneListExist = context.containsBean("list3");

        //Then
        Assertions.assertEquals("task1 to do list", result1);
        Assertions.assertTrue(toDoListExist);
        System.out.println("Bean toDoList was found in the container: " + toDoListExist);

        Assertions.assertEquals("task1 in progress list", result2);
        Assertions.assertTrue(inProgressListExist);
        System.out.println("Bean inProgressList was found in the container: " + inProgressListExist);

        Assertions.assertEquals("task1 done list", result3);
        Assertions.assertTrue(doneListExist);
        System.out.println("Bean doneList was found in the container: " + doneListExist);

    }
}
