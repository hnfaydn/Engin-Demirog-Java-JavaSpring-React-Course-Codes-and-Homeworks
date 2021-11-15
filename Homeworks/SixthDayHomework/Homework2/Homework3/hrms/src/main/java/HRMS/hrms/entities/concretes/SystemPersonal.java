package HRMS.hrms.entities.concretes;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@Entity
@Table(name="SystemPersonal")
public class SystemPersonal extends Users {
    @Column(name="SystemPersonalId")
    private int systemPersonalId;

    @Column(name="SystemPersonalName")
    private String systemPersonalName;

    @Column(name="SystemPersonalLastName")
    private String systemPersonalLastName;

    @Column(name="Authority")
    private String autority;

}
