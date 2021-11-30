package com.HRMS.hrms.bussiness.userBussiness.concretes;

import com.HRMS.hrms.bussiness.userBussiness.abstracts.EmployeeCandidateService;
import com.HRMS.hrms.core.mernisCheck.abstracts.EmployeeCandidateMernisCheckService;
import com.HRMS.hrms.core.results.ErrorResult;
import com.HRMS.hrms.core.results.Result;
import com.HRMS.hrms.core.results.SuccesDataResult;
import com.HRMS.hrms.core.results.SuccesResult;
import com.HRMS.hrms.core.utilities.abstracts.EmailVerificationAdopterService;
import com.HRMS.hrms.dataAccess.userDataAccess.abstracts.EmployeeCandidateDao;
import com.HRMS.hrms.dataAccess.userDataAccess.abstracts.UserDao;
import com.HRMS.hrms.entities.userEntities.concretes.EmployeeCandidate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class EmployeeCandidateManager implements EmployeeCandidateService {

    EmployeeCandidateDao employeeCandidateDao;
    EmailVerificationAdopterService emailVerificationAdopterService;
    EmployeeCandidateMernisCheckService employeeCandidateMernisCheckService;
    UserDao userDao;


    @Autowired
    public EmployeeCandidateManager(EmployeeCandidateDao employeeCandidateDao,
                                    EmailVerificationAdopterService emailVerificationAdopterService,
                                    EmployeeCandidateMernisCheckService employeeCandidateMernisCheckService,
                                    UserDao userDao) {

        this.employeeCandidateDao = employeeCandidateDao;
        this.emailVerificationAdopterService = emailVerificationAdopterService;
        this.employeeCandidateMernisCheckService = employeeCandidateMernisCheckService;
        this.userDao = userDao;

    }

    @Override
    public List<EmployeeCandidate> getAll() {

        return this.employeeCandidateDao.findAll();
    }

    @Override
    public Result add(EmployeeCandidate employeeCandidate) {

        Result employeeInformationCheck = employeeCandidateInformationCheck(employeeCandidate);

        if(!employeeInformationCheck.isSuccess()){
            return new ErrorResult("User have invalid information");
        }

        Result employeeMernisCheck=null;

        try {
            employeeMernisCheck = employeeCandidateMernisCheckService.employeeCandidateMernisCheck(employeeCandidate);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (!employeeMernisCheck.isSuccess()){
            return new ErrorResult("Mernis verification did not done by successfully");
        }

        Result employeeEmailVerification = emailVerificationAdopterService.emailVerification(employeeCandidate.getUser());

        if (!employeeEmailVerification.isSuccess()){
            return new ErrorResult("Email verification did not done by successfully");
        }

        employeeCandidateDao.save(employeeCandidate);

        return new SuccesDataResult<EmployeeCandidate>(employeeCandidate,"Employee saved to database successfully");
    }
    
    private Result employeeCandidateInformationCheck(EmployeeCandidate employeeCandidate){
        if(employeeCandidate.getUser().getEmail()==null){
            return new ErrorResult("Employee email can not null.");
        }

        if(employeeCandidate.getUser().getPassword()==null){
            return new ErrorResult("Employee password can not null.");
        }

        if (employeeCandidate.getFirstName() == null) {
            return new ErrorResult("Employee firstname can not null.");
        }

        if (employeeCandidate.getSurName() == null) {
            return new ErrorResult("Employee surname can not null.");
        }

        if (employeeCandidate.getIdentityNumber()==null){
            return new ErrorResult("Employee identity number can not null.");
        }

        if (employeeCandidate.getIdentityNumber().length()!=11){
            return new ErrorResult("Employee identity number lenght should have 11.");
        }

        if(Integer.parseInt(employeeCandidate.getYearOfBirth())<1900 ||
                Integer.parseInt(employeeCandidate.getYearOfBirth()) >LocalDate.now().getYear()){
            return new ErrorResult("Birth year can not lower than 1900 or higher than current year.");
        }

        if(userDao.findByEmail(employeeCandidate.getUser().getEmail()).stream().count()!=0){
            return new ErrorResult("This email is using by another employee please check your email adress.");
        }

        if (employeeCandidateDao.findByIdentityNumber(employeeCandidate.getIdentityNumber()).stream().count()!=0){
            return new ErrorResult("This identity number is using by another employee please check your identity number.");
        }

        return new SuccesResult("Employee information checked successfully");
    }

}
