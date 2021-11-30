package com.HRMS.hrms.entities.userEntities.concretes;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Table(name="job_titles")
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class JobTitle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name="id")
    private int id;

    @Column(name="job_title")
    private String jobTitle;
}
