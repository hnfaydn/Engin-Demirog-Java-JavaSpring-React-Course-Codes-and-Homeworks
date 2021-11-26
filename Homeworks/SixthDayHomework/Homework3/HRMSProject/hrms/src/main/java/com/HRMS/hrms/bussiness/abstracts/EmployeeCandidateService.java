package com.HRMS.hrms.bussiness.abstracts;

import com.HRMS.hrms.entities.concretes.EmployeeCandidate;

import java.util.List;

public interface EmployeeCandidateService {

    List<EmployeeCandidate> getAll();
}
