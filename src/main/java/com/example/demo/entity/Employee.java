package com.example.demo.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.EnumType;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.JoinColumn;
import java.math.BigDecimal;
import java.time.LocalDate;

@RequiredArgsConstructor 
@Setter 
@Getter 

@Entity
@Table(name = "employees")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String firstName;
    private String lastName;
    private String email;
    private BigDecimal salary;
    private LocalDate hireDate;
    private LocalDate terminationDate;

    @Enumerated(EnumType.STRING)
    private EmployeeStatus status;

    @ManyToOne
    @JoinColumn(name = "department_id")
    private Department department;


    public enum EmployeeStatus {
        ACTIVE,
        INACTIVE,
        TERMINATED
    }
}
