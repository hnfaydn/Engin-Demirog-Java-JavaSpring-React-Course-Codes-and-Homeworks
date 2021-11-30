package com.HRMS.hrms.bussiness.userBussiness.abstracts;

import com.HRMS.hrms.core.results.Result;
import com.HRMS.hrms.entities.userEntities.concretes.EmployeeCandidate;

import java.util.List;

public interface EmployeeCandidateService {

    List<EmployeeCandidate> getAll();

    Result add(EmployeeCandidate employeeCandidate);
}
