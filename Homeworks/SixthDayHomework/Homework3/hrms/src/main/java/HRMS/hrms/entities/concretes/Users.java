package HRMS.hrms.entities.concretes;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "Users")
public class Users {

    @Id
    @GeneratedValue

    @Column(name="Id")
    private int id;

    @Column(name="Email")
    private String email;

    @Column(name="Password")
    private String password;

    @Column(name="RePassword")
    private String rePassword;


}
