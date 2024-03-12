package com.javaspringtest.testcrud.controller;

import com.javaspringtest.testcrud.entity.EmployeEntity;
import com.javaspringtest.testcrud.service.EmployeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class EmployeController {

    @Autowired
    private EmployeService service;

    @PostMapping("/addemploye")
    public EmployeEntity addEmploye(@RequestBody EmployeEntity employe){
        return service.saveEmploye(employe);
    }

    @GetMapping("/getemployebyid/{id}")
    public EmployeEntity getEmployeByID(@PathVariable int id){
        return service.getEmployeById(id);
    }

    @GetMapping("/getemployebyname/{name}")
    public EmployeEntity getEmployeByName(@PathVariable String name){
        return service.getEmployeByName(name);
    }

    @PutMapping("/updateemploye")
    public EmployeEntity updateEmploye(@RequestBody EmployeEntity employe){
        return service.updateEmployee(employe);
    }

    @DeleteMapping("/deleteemploye/{id}")
    public String deleteEmployeById(@PathVariable int id){
        return service.deleteEmploye(id);
    }
}
