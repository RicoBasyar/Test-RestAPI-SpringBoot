package com.javaspringtest.testcrud.repository;

import com.javaspringtest.testcrud.entity.EntityEmploye;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeRepository extends JpaRepository<EntityEmploye, Integer> {

}
