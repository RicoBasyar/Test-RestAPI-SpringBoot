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
@Table(name='EMPLOYEENTITY')
public class EntityEmploye {

    @Id
    @GeneratedValue
    private int employe_id;
    private String employe_name;
    private double employe_salary;

}
