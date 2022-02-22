package com.sofka.demo.controllers;

import com.sofka.demo.model.Employee;
import com.sofka.demo.repository.IEmployeeJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/empl")
public class EmployeeController {
    @Autowired
    IEmployeeJpaRepository IEmployeeJpaRepository;

    @GetMapping()
    public ArrayList<Employee> getEmployee(){
        return IEmployeeJpaRepository.getEmployee();
    }

    @PostMapping()
    public Employee saveEmployee(@RequestBody Employee empl){
        return this.IEmployeeJpaRepository.saveEmployee(empl);
    }

    @DeleteMapping(path="/{id}")
    public ResponseEntity<Void> deleteEmployee(@PathVariable String id){
        Employee.remove(id);
        return ResponseEntity.noContent().build();
    }
}
