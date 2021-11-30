package com.HRMS.hrms.entities.userEntities.abstracts;

import com.HRMS.hrms.entities.userEntities.concretes.EmployeeCandidate;
import com.HRMS.hrms.entities.userEntities.concretes.Employer;
import com.HRMS.hrms.entities.userEntities.concretes.SystemEmployee;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "users")
@Getter
@Setter
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)


    @Column(name="id")
    private int id;


    @Column(name="email")
    private String email;

    @Column(name="password")
    private String password;

    @JsonIgnore
    @OneToOne(mappedBy = "user", cascade = CascadeType.ALL)
    @PrimaryKeyJoinColumn
    private EmployeeCandidate employeeCandidate;

    @JsonIgnore
    @OneToOne(mappedBy = "user", cascade = CascadeType.ALL)
    @PrimaryKeyJoinColumn
    private Employer employer;

    @JsonIgnore
    @OneToOne(mappedBy = "user", cascade = CascadeType.ALL)
    @PrimaryKeyJoinColumn
    private SystemEmployee systemEmployee;

}
