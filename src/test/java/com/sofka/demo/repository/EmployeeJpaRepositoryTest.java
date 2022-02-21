package com.sofka.demo.repository;

import com.sofka.demo.model.Employee;
import com.sofka.demo.repository.IEmployeeJpaRepository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jdbc.EmbeddedDatabaseConnection;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import static org.junit.jupiter.api.Assertions.assertEquals;

@DataJpaTest
@AutoConfigureTestDatabase(connection = EmbeddedDatabaseConnection.H2)//base de datos en memoriau
public class EmployeeJpaRepositoryTest {
    @Autowired
    private IEmployeeJpaRepository repo;

    @Test
    public void saveEmployee() {
        Employee jhon = new Employee("Jhon", "Smith", "empl123");
        Employee Susana = new Employee("Susana", "Valencia", "empl124");

        repo.save(jhon);
        repo.save(Susana);

        repo.flush();

        assertEquals(2, repo.findAll().size());
    }
}
