package com.kodilla.hibernate.manytomany.dao;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Repository
public interface CompanyDao extends CrudRepository<Company, Integer> {

    @Query
    List<Company> retrieveCompanyWithFirstThreeSpecificSigns (@Param("FIRST_THREE_SIGNS") String firstThreeSigns);

    @Query
    List<Company> retrieveCompanyWithInsertedSigns (@Param("INSERTED_SIGNS") String insertedSigns);
}
