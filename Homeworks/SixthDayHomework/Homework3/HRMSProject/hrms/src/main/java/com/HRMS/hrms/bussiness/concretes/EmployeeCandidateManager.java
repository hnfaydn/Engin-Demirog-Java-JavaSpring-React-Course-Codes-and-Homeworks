package com.HRMS.hrms.bussiness.concretes;

import com.HRMS.hrms.bussiness.abstracts.EmployeeCandidateService;
import com.HRMS.hrms.dataAccess.abstracts.EmployeeCandidateDao;
import com.HRMS.hrms.entities.concretes.EmployeeCandidate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeCandidateManager implements EmployeeCandidateService {

    EmployeeCandidateDao employeeCandidateDao;


    @Autowired
    public EmployeeCandidateManager(EmployeeCandidateDao employeeCandidateDao) {
        this.employeeCandidateDao = employeeCandidateDao;

    }


    @Override
    public List<EmployeeCandidate> getAll() {

        return this.employeeCandidateDao.findAll();
    }
}
