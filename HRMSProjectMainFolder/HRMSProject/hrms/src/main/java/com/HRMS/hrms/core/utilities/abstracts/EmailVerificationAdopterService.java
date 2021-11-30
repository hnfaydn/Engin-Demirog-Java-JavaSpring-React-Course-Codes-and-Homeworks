package com.HRMS.hrms.core.utilities.abstracts;

import com.HRMS.hrms.core.results.Result;
import com.HRMS.hrms.entities.userEntities.abstracts.User;
import com.HRMS.hrms.entities.userEntities.concretes.EmployeeCandidate;
import com.HRMS.hrms.entities.userEntities.concretes.Employer;

public interface EmailVerificationAdopterService {

    Result emailVerification(User user);


}
