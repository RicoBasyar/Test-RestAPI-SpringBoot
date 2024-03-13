package com.javaspringtest.testcrud.service;

import com.javaspringtest.testcrud.entity.StudentEntity;
import com.javaspringtest.testcrud.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
    private StudentRepository repository;

    public StudentEntity addStudent(StudentEntity student){
        return repository.save(student);
    }

    public StudentEntity getStudentById(int id){
        return repository.findById(id).orElse(null);
    }

    public StudentEntity getStudentByName(String name){
        return repository.findByName(name);
    }

    public StudentEntity updateStudent(StudentEntity student){
        StudentEntity ExistingStudentEntity = repository.findById(student.getStudentID()).orElse(null);
        ExistingStudentEntity.setStudentName(student.getStudentName());
        ExistingStudentEntity.setStudentAge(student.getStudentAge());
        ExistingStudentEntity.setStudentYear(student.getStudentYear());
        return repository.save(ExistingStudentEntity);
    }

    public String deleteStudentbyID(int id){
        repository.deleteById(id);
        return "Student Data Has Been Deleted";
    }
}
