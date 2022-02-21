package com.sofka.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import javax.management.relation.Role;
import org.springframework.stereotype.Repository;

public interface IRoleJpaRepository extends JpaRepository<Role,Long> {
    Role findByName(String name);
}
