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
@Table(name="STUDENT")
public class StudentEntity {

    @Id
    @GeneratedValue
    private int StudentID;
    private String StudentName;
    private int StudentAge;
    private String StudentYear;
}
