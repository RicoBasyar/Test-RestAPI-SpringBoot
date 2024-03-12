package com.javaspringtest.testcrud.service;

import com.javaspringtest.testcrud.entity.EmployeEntity;
import com.javaspringtest.testcrud.repository.EmployeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeService {

    @Autowired
    private EmployeRepository repository;

    public EmployeEntity saveEmploye(EmployeEntity employe){
        return repository.save(employe);
    }

    public EmployeEntity getEmployeById(int id){
        return repository.findById(id).orElse(null);
    }

    public EmployeEntity getEmployeByName(String name){
        return repository.findEmployeByName(name);
    }

    public String deleteEmploye(int id){
        repository.deleteById(id);
        return "This User Has been Deleted";
    }

    public EmployeEntity updateEmployee(EmployeEntity employe){
        EmployeEntity newEmployeEntity = repository.findById(employe.getEmployeid()).orElse(null);
        newEmployeEntity.setEmployename(employe.getEmployename());
        newEmployeEntity.setEmployesalary(employe.getEmployesalary());
        return repository.save((newEmployeEntity));
    }


}
