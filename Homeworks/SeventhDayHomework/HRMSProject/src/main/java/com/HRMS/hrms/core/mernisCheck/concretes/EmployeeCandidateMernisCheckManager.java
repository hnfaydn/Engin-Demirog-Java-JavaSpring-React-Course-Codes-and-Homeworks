package com.HRMS.hrms.core.mernisCheck.concretes;

import com.HRMS.hrms.core.mernisCheck.abstracts.EmployeeCandidateMernisCheckService;
import com.HRMS.hrms.core.results.ErrorResult;
import com.HRMS.hrms.core.results.Result;
import com.HRMS.hrms.core.results.SuccesDataResult;
import com.HRMS.hrms.entities.userEntities.concretes.EmployeeCandidate;
import com.HRMS.mernis.EEFKPSPublicSoap12;
import org.springframework.stereotype.Service;

@Service
public class EmployeeCandidateMernisCheckManager implements EmployeeCandidateMernisCheckService {
    @Override
    public Result employeeCandidateMernisCheck(EmployeeCandidate employeeCandidate) throws Exception {

        EEFKPSPublicSoap12 eefkpsPublicSoap12 = new EEFKPSPublicSoap12();

        boolean validation = eefkpsPublicSoap12.TCKimlikNoDogrula(Long.parseLong(employeeCandidate.getIdentityNumber()),
                employeeCandidate.getFirstName(),
                employeeCandidate.getSurName(),
                Integer.parseInt(employeeCandidate.getYearOfBirth()));

        if(!validation){
            return new ErrorResult("Mernis Validation did not done for identity: "+employeeCandidate.getIdentityNumber()+
               ", first name: "+employeeCandidate.getFirstName()+", surname :"+employeeCandidate.getSurName()+", Birth year: "
                 +employeeCandidate.getYearOfBirth()+" please check your information");
        }
        else{
            return new SuccesDataResult<EmployeeCandidate>(employeeCandidate,"this employee's mernis check done by correctly");
        }
    }
}
