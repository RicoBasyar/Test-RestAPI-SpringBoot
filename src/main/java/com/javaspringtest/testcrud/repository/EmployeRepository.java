package com.javaspringtest.testcrud.repository;

import com.javaspringtest.testcrud.entity.EmployeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface EmployeRepository extends JpaRepository<EmployeEntity, Integer> {

    @Query("SELECT e FROM EmployeEntity e where e.employename = :employename")
    EmployeEntity findEmployeByName(String employename);
}
