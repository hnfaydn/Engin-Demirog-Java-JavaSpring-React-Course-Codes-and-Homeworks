package HRMS.hrms.entities.concretes;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@Entity
@Table(name="Employers")
public class Employers extends Users{

    @Column(name="EmployerId")
    private int employerId;

    @Column(name="CompanyName")
    private String companyName;

    @Column(name="PhoneNumber")
    private String phoneNumber;

    @Column(name="WebSite")
    private String webSite;
}
