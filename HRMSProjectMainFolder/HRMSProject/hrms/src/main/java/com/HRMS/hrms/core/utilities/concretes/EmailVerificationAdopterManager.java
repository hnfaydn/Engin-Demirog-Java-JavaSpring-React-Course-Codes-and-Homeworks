package com.HRMS.hrms.core.utilities.concretes;

import com.HRMS.hrms.core.results.Result;
import com.HRMS.hrms.core.results.SuccesResult;
import com.HRMS.hrms.core.utilities.abstracts.EmailVerificationAdopterService;
import com.HRMS.hrms.entities.userEntities.abstracts.User;
import com.HRMS.hrms.entities.userEntities.concretes.EmployeeCandidate;
import com.HRMS.hrms.entities.userEntities.concretes.Employer;
import org.springframework.stereotype.Service;

@Service
public class EmailVerificationAdopterManager implements EmailVerificationAdopterService {
    @Override
    public Result emailVerification(User user) {
        return new SuccesResult("Email verified successfully");
    }

}
