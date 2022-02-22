package com.sofka.demo.repository;

import com.sofka.demo.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.management.relation.Role;
import java.util.ArrayList;
import java.util.List;

@Repository
public interface IEmployeeJpaRepository extends JpaRepository<Employee, Long>{
    //Selecciona los campos de la tabla Employee desde employeeid ='[paramentro]'
    Employee findByEmployeeid(String employeeid);

    ArrayList<Employee> getEmployee();

    Employee saveEmployee(Employee empl);

    //Employee deleteByEmployeeid(String employeeid);

    List<Employee> findByFirstName(String firstName);

    List<Employee> findByLastName(String lastName);

    List<Employee> findByRole(Role role);


}
