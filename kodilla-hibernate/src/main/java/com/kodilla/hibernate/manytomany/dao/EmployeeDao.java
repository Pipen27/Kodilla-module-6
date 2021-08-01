package com.kodilla.hibernate.manytomany.dao;

import com.kodilla.hibernate.manytomany.Employee;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Repository
public interface EmployeeDao extends CrudRepository<Employee, Integer> {

    @Query
    List<Employee> retrieveEmployeesWithSpecificLastname (@Param("LASTNAME") String lastname);

    @Query
    List<Employee> retrieveEmployeeWithInsertedSigns (@Param("INSERTED_SIGNS") String insertedSigns);
}
