package com.HRMS.hrms.core.mernisCheck.abstracts;

import com.HRMS.hrms.core.results.Result;
import com.HRMS.hrms.entities.userEntities.concretes.EmployeeCandidate;

public interface EmployeeCandidateMernisCheckService {

    Result employeeCandidateMernisCheck(EmployeeCandidate employeeCandidate) throws Exception;
}
