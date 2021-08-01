package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ManyToManyFacadeTest {

    @Autowired
    private CompanyDao companyDao;
    @Autowired
    private EmployeeDao employeeDao;
    @Autowired
    private ManyToManyFacade manyToManyFacade;

    @Test
    void testFindCompanyWithSpecificSigns() {
        //Given

        Company softwareMachine = new Company("Software Machine");
        Company dataMaesters = new Company("Data Maesters");
        Company greyMatter = new Company("Grey Matter");

        companyDao.save(softwareMachine);
        int id1 = softwareMachine.getId();
        companyDao.save(dataMaesters);
        int id2 = dataMaesters.getId();
        companyDao.save(greyMatter);
        int id3 = greyMatter.getId();

        //When
        List<Company> insertedSignsSearching = manyToManyFacade.findCompanyWithSpecificSigns("%Ma%");

        //Then
        try {
            assertEquals(3, insertedSignsSearching.size());

        } finally {

        //CleanUp
        companyDao.deleteById(id1);
        companyDao.deleteById(id2);
        companyDao.deleteById(id3);
        }

    }

    @Test
    void testFindEmployeeWithSpecificSigns() {
        //Given

        Employee johnSmith = new Employee("John", "Smith");
        Employee stephanieClarckson = new Employee("Stephanie", "Clarckson");
        Employee lindaKovalsky = new Employee("Linda", "Kovalsky-Henderson");


        employeeDao.save(johnSmith);
        int id1 = johnSmith.getId();
        employeeDao.save(stephanieClarckson);
        int id2 = stephanieClarckson.getId();
        employeeDao.save(lindaKovalsky);
        int id3 = lindaKovalsky.getId();


        //When
        List<Employee> insertedSignsSearching = manyToManyFacade.findEmployeeWithSpecificSigns("%son%");

        //Then
        try {
            assertEquals(2, insertedSignsSearching.size());

        } finally {

        //CleanUp
        employeeDao.deleteById(id1);
        employeeDao.deleteById(id2);
        employeeDao.deleteById(id3);
        }

    }
}