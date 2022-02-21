package com.sofka.demo.repository;

import com.sofka.demo.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEmployeeJpaRepository extends JpaRepository<Employee, Long>{

    //Selecciona los campos de la tabla Employee desde employeeid ='[paramentro]'
    Employee findByEmployeedid(String employeeid);

}
