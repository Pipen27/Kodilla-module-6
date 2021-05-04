package com.kodilla.hibernate.task.dao;

import com.kodilla.hibernate.task.Task;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public interface TaskDao extends CrudRepository <Task, Integer> {
    List<Task> findByDuration (int duration);

    @Query
    List<Task> retrieveLongTasks();

    @Query
    List<Task> retrieveShortTasks();

    @Query
    List<Task> retrieveTasksWithEnoughTime();

    @Query
    List<Task> retrieveTasksWithDurationLongerThan (@Param("DURATION") int duration);
}
