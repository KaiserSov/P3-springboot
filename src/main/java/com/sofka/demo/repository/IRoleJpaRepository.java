package com.sofka.demo.repository;

import com.sofka.demo.model.Role;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRoleJpaRepository extends JpaRepository<Role,Long> {
    Role findByName(String name);
}
