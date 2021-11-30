package com.HRMS.hrms.entities.userEntities.concretes;

import com.HRMS.hrms.entities.userEntities.abstracts.User;
import lombok.AllArgsConstructor;
import lombok.Data;

import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name="employers")
public class Employer{
    @Id

    @Column(name="employer_id")
    private int employerId;

    @Column(name="company_name")
    private String companyName;

    @Column(name="web_page")
    private String webPage;

    @Column(name="phone_number")
    private String phoneNumber;

    @OneToOne
    @MapsId
    @JoinColumn(name = "employer_id")
    private User user;
}
