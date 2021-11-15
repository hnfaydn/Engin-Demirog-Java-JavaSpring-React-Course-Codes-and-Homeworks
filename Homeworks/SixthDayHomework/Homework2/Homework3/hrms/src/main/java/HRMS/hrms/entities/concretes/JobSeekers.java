package HRMS.hrms.entities.concretes;

import lombok.Data;
import lombok.Generated;

import javax.persistence.*;

@Data
@Entity
@Table(name="JobSeekers")
public class JobSeekers extends Users{


    @Column(name="JobSeekerId")
    private int id;

    @Column(name="FirstName")
    private String firstName;

    @Column(name="LastName")
    private String lastName;

    @Column(name="NationalityId")
    private String nationalityId;

    @Column(name="YearOfBirth")
    private String dateOfBirth;




}
