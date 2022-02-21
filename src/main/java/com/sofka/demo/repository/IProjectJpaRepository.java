package com.sofka.demo.repository;

import com.sofka.demo.model.Project;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface IProjectJpaRepository extends JpaRepository<Project, Long> {
    Project findByName(String name);
}
