package com.javaspringtest.testcrud.controller;

import com.javaspringtest.testcrud.entity.StudentEntity;
import com.javaspringtest.testcrud.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class StudentController {

    @Autowired
    private StudentService service;

    @PostMapping("/addstudent")
    public StudentEntity addStudent(@RequestBody StudentEntity student){
        return service.addStudent(student);
    }

    @GetMapping("/studentid/{id}")
    public StudentEntity readDataStudentById(@PathVariable int id){
        return service.getStudentById(id);
    }

    @GetMapping("/studentname/{name}")
    public StudentEntity readDataStudentByName(@PathVariable String name){
        return service.getStudentByName(name);
    }

    @PutMapping("/updatestudent")
    public StudentEntity updateDataStudent(@RequestBody StudentEntity student){
        return service.updateStudent(student);
    }

    @DeleteMapping("/deletestudentid/{id}")
    public String deleteDataStudentById(@PathVariable int id){
        return service.deleteStudentbyID(id);
    }

}
