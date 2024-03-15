package com.javaspringtest.testcrud.repository;

import com.javaspringtest.testcrud.entity.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

// Nanti Coba pake Folder DTO
public interface StudentRepository extends JpaRepository<StudentEntity, Integer> {
    @Query("SELECT e FROM StudentEntity e where e.StudentName = :name")
    StudentEntity findByName(String name);
}
