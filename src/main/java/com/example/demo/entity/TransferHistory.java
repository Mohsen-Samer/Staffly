
package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.JoinColumn;

import java.time.LocalDate;
@Setter 
@Getter 
@RequiredArgsConstructor 
@Entity
@Table(name = "transfer_history")
public class TransferHistory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "employee_id")
    private Employee employee;

    @ManyToOne
    @JoinColumn(name = "from_department_id")
    private Department fromDepartment;

    @ManyToOne
    @JoinColumn(name = "to_department_id")
    private Department toDepartment;

    private LocalDate transferDate;

}
