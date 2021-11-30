package com.HRMS.hrms.dataAccess.userDataAccess.abstracts;

import com.HRMS.hrms.entities.userEntities.concretes.Employer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployerDao extends JpaRepository<Employer, Integer> {
}
