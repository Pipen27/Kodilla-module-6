package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.task.Task;
import com.kodilla.hibernate.task.dao.TaskDao;
import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class TaskListDaoTestSuite {

    @Autowired
    private TaskListDao taskListDao;
    private static final String DESCRIPTION = "Test2: Learn Hibernate";

    @Test
    void testFindByListName() {
        //Given
        TaskList task = new TaskList("To Do", DESCRIPTION);
        taskListDao.save(task);
        String name = task.getListName();

        //When
        List<TaskList> readTasks = taskListDao.findByListName(name);

        //Then
        assertEquals(1, readTasks.size());

        //CleanUp
        int id = readTasks.get(0).getId();
        taskListDao.deleteById(id);
    }
}
