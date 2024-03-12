package com.javaspringtest.testcrud.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="EMPLOYE_ENTITY")
public class EmployeEntity {

    @Id
    @GeneratedValue
    private int employeid;
    private String employename;
    private double employesalary;

}
