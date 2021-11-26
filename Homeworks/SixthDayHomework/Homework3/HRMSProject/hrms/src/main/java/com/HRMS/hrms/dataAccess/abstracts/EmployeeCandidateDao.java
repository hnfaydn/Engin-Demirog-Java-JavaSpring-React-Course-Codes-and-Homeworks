package com.HRMS.hrms.dataAccess.abstracts;

import com.HRMS.hrms.entities.concretes.EmployeeCandidate;
import org.springframework.data.jpa.repository.JpaRepository;


public interface EmployeeCandidateDao extends JpaRepository<EmployeeCandidate, Integer> {



}
