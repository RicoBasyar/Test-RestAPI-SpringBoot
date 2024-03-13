package com.javaspringtest.testcrud.repository;

import com.javaspringtest.testcrud.entity.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface StudentRepository extends JpaRepository<StudentEntity, Integer> {
}
