package com.HRMS.hrms.bussiness.userBussiness.concretes;

import com.HRMS.hrms.bussiness.userBussiness.abstracts.EmployerService;
import com.HRMS.hrms.core.results.ErrorResult;
import com.HRMS.hrms.core.results.Result;
import com.HRMS.hrms.core.results.SuccesDataResult;
import com.HRMS.hrms.core.results.SuccesResult;
import com.HRMS.hrms.core.utilities.abstracts.EmailVerificationAdopterService;
import com.HRMS.hrms.dataAccess.userDataAccess.abstracts.EmployerDao;
import com.HRMS.hrms.dataAccess.userDataAccess.abstracts.UserDao;
import com.HRMS.hrms.entities.userEntities.concretes.Employer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployerManager implements EmployerService {

    EmployerDao employerDao;
    UserDao userDao;
    EmailVerificationAdopterService emailVerificationAdopterService;

    @Autowired
    public EmployerManager(EmployerDao employerDao,
                           UserDao userDao,
                           EmailVerificationAdopterService emailVerificationAdopterService) {

        this.employerDao = employerDao;
        this.userDao = userDao;
        this.emailVerificationAdopterService = emailVerificationAdopterService;
    }

    @Override
    public List<Employer> getAll() {
        return this.employerDao.findAll();
    }

    @Override
    public Result add(Employer employer) {

        Result employerInformationValidation = checkEmployerInformation(employer);
        if(!employerInformationValidation.isSuccess()){
            return new ErrorResult("Employer informations are not valid");
        }


        Result emailVerificationOfEmployer = emailVerificationAdopterService.emailVerification(employer.getUser());

        if(!emailVerificationOfEmployer.isSuccess()){
            return new ErrorResult("Employer email verification is did not done");
        }

        /*
        boolean systemEmployeeConfirmation

        if(!systemEmployeeConfirmation){
        return new ErrorResult("This Employer did not confirm by any admin");
        }
        this part will code after other database entities
        */

        return new SuccesDataResult<Employer>(employer,"Employer added to database");
    }

    private Result checkEmployerInformation(Employer employer){

        if (employer.getCompanyName()==null){
            return new ErrorResult("Company name can not null");
        }

        if (employer.getUser().getPassword()==null) {
            return new ErrorResult("Password can not null");
        }

        if(employer.getUser().getEmail()==null){
            return new ErrorResult("Email can not null");
        }

        if(employer.getPhoneNumber()==null){
            return new ErrorResult("Phone number can not null");
        }

        if (employer.getWebPage()==null){
            return new ErrorResult("Web adress can not null");
        }


        String[] webPageDomain = employer.getWebPage().split("\\.",2);
        String[] emailDomain = employer.getUser().getEmail().split("\\@",2);

        if (!webPageDomain[1].equals(emailDomain[1])){
            return new ErrorResult("Email and webpage domains are not same");
        }

        if (userDao.findByEmail(employer.getUser().getEmail()).stream().count()!=0){
            return new ErrorResult("This Email is using by another company please check your email adress.");
        }


        return new SuccesResult("Employer information checked and confirmed");

    }

}
