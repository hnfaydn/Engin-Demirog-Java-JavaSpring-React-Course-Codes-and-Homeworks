package com.HRMS.hrms.bussiness.concretes;

import com.HRMS.hrms.bussiness.abstracts.EmployerService;
import com.HRMS.hrms.dataAccess.abstracts.EmployerDao;
import com.HRMS.hrms.entities.concretes.Employer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployerManager implements EmployerService {

    EmployerDao employerDao;

    @Autowired
    public EmployerManager(EmployerDao employerDao) {
        this.employerDao = employerDao;
    }

    @Override
    public List<Employer> getAll() {
        return this.employerDao.findAll();
    }
}
