package com.sofka.demo.repository;

import com.sofka.demo.model.Employee;
import com.sofka.demo.repository.IEmployeeJpaRepository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jdbc.EmbeddedDatabaseConnection;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import javax.management.relation.InvalidRoleInfoException;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DataJpaTest
@AutoConfigureTestDatabase (replace = AutoConfigureTestDatabase.Replace.NONE)
 //@AutoConfigureTestDatabase(connection = EmbeddedDatabaseConnection.H2)//base de datos en memoriau
public class EmployeeJpaRepositoryTest {
    @Autowired
    private IEmployeeJpaRepository repoEmp1;

    @Autowired
    private IRoleJpaRepository repoRole;

    @Autowired
    private IProjectJpaRepository repoProj;

    @Test
    public void saveEmployee() {
        Employee jhon = new Employee("Jhon", "Smith", "empl123");
        Employee Susana = new Employee("Susana", "Valencia", "empl124");

        repoEmp1.save(jhon);
        repoEmp1.save(Susana);

        repoEmp1.flush();

        assertEquals(2, repoEmp1.findAll().size());
    }
}
