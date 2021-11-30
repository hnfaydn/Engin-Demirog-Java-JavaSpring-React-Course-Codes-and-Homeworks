package com.HRMS.hrms.dataAccess.userDataAccess.abstracts;

import com.HRMS.hrms.entities.userEntities.concretes.EmployeeCandidate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeCandidateDao extends JpaRepository<EmployeeCandidate, Integer> {

    List<EmployeeCandidate> findByIdentityNumber(String identityNumber);

}
