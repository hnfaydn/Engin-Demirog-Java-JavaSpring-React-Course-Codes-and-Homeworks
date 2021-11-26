package com.HRMS.hrms.entities.concretes;

import com.HRMS.hrms.entities.abstracts.User;
import lombok.*;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "employee_candidates")
public class EmployeeCandidate {

    @Id

    @Column(name="employee_candidate_id")
    private int employeeCandidateId;

    @Column(name="first_name")
    private String firstName;

    @Column(name="sur_name")
    private String surName;

    @Column(name="identity_number")
    private String identityNumber;

    @Column(name = "year_of_birth")
    private String yearOfBirth;

    @OneToOne
    @MapsId
    @JoinColumn(name = "employee_candidate_id")
    private User user;
}
