package com.HRMS.hrms.bussiness.userBussiness.concretes;

import com.HRMS.hrms.bussiness.userBussiness.abstracts.SystemEmployeeService;
import com.HRMS.hrms.core.results.ErrorResult;
import com.HRMS.hrms.core.results.Result;
import com.HRMS.hrms.core.results.SuccesDataResult;
import com.HRMS.hrms.core.results.SuccesResult;
import com.HRMS.hrms.core.utilities.abstracts.EmailVerificationAdopterService;
import com.HRMS.hrms.dataAccess.userDataAccess.abstracts.SystemEmployeeDao;
import com.HRMS.hrms.dataAccess.userDataAccess.abstracts.UserDao;
import com.HRMS.hrms.entities.userEntities.concretes.SystemEmployee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SystemEmployeeManager implements SystemEmployeeService {
    SystemEmployeeDao systemEmployeeDao;
    UserDao userDao;
    EmailVerificationAdopterService emailVerificationAdopterService;

    @Autowired
    public SystemEmployeeManager(SystemEmployeeDao systemEmployeeDao) {
        this.systemEmployeeDao = systemEmployeeDao;
    }

    @Override
    public List<SystemEmployee> getAll() {
        return this.systemEmployeeDao.findAll();
    }

    @Override
    public Result add(SystemEmployee systemEmployee) {

        Result informationCheckOfSystemEmployee = checkSystemEmployeeInformation(systemEmployee);

        if (!informationCheckOfSystemEmployee.isSuccess()){
            return new ErrorResult("System employee informations are not valid");
        }

        Result emailVerificationOfSystemEmployee = emailVerificationAdopterService.emailVerification(systemEmployee.getUser());

        if (!emailVerificationOfSystemEmployee.isSuccess()){
            return new ErrorResult("System employee email is not verified");
        }

        systemEmployeeDao.save(systemEmployee);

        return new SuccesDataResult<SystemEmployee>(systemEmployee,"System employee added to database successfully.") ;
    }


    private Result checkSystemEmployeeInformation(SystemEmployee systemEmployee){

        if(systemEmployee.getUser().getEmail()==null){
            return new ErrorResult("System Employee email can not null.");
        }

        if(systemEmployee.getUser().getPassword()==null){
            return new ErrorResult("System Employee password can not null.");
        }

        if (systemEmployee.getFirstName() == null) {
            return new ErrorResult("System Employee firstname can not null.");
        }

        if (systemEmployee.getSurName() == null) {
            return new ErrorResult("System Employee surname can not null.");
        }

        if (systemEmployee.getPosition() == null) {
            return new ErrorResult("System Employee position can not null.");
        }

        return new SuccesResult("System employee informations are valid");

    }
}
