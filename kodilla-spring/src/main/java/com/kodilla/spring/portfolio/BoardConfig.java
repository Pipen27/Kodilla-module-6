package com.kodilla.spring.portfolio;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BoardConfig {

    @Bean(name = "list3")
    public TaskList doneList() {
        return new TaskList();
    }

    @Bean(name = "list2")
    public TaskList inProgressList() {
        return new TaskList();
    }

    @Bean(name = "list1")
    public TaskList toDoList() {
        return new TaskList();
    }
    @Bean
    public Board board() {
        return new Board();
    }


}
