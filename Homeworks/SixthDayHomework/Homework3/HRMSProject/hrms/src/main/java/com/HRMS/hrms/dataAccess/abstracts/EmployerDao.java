package com.HRMS.hrms.dataAccess.abstracts;

import com.HRMS.hrms.entities.concretes.Employer;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface EmployerDao extends JpaRepository<Employer, Integer> {
}
