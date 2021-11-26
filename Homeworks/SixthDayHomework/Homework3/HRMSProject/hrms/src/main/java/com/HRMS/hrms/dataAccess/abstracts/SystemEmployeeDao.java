package com.HRMS.hrms.dataAccess.abstracts;

import com.HRMS.hrms.entities.concretes.SystemEmployee;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface SystemEmployeeDao extends JpaRepository<SystemEmployee, Integer> {
}
