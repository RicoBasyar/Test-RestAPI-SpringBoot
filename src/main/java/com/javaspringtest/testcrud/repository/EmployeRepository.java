package com.javaspringtest.testcrud.repository;

import com.javaspringtest.testcrud.entity.EmployeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeRepository extends JpaRepository<EmployeEntity, Integer> {

}
