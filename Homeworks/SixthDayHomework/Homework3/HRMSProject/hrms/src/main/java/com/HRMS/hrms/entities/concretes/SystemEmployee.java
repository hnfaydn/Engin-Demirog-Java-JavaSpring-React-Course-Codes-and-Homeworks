package com.HRMS.hrms.entities.concretes;

import com.HRMS.hrms.entities.abstracts.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name="system_employees")
public class SystemEmployee{
    @Id
    @Column(name = "system_employee_id")
    private int systemEmployerId;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "sur_name")
    private String surName;

    @Column(name = "position")
    private String position;

    @OneToOne
    @MapsId
    @JoinColumn(name = "system_employee_id")
    private User user;
}
