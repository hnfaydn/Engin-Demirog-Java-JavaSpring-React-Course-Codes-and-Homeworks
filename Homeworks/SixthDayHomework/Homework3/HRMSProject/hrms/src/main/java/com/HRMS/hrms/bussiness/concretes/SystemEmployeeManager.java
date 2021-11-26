package com.HRMS.hrms.bussiness.concretes;

import com.HRMS.hrms.bussiness.abstracts.SystemEmployeeService;
import com.HRMS.hrms.dataAccess.abstracts.SystemEmployeeDao;
import com.HRMS.hrms.entities.concretes.SystemEmployee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SystemEmployeeManager implements SystemEmployeeService {
    SystemEmployeeDao systemEmployeeDao;

    @Autowired
    public SystemEmployeeManager(SystemEmployeeDao systemEmployeeDao) {
        this.systemEmployeeDao = systemEmployeeDao;
    }

    @Override
    public List<SystemEmployee> getAll() {
        return this.systemEmployeeDao.findAll();
    }
}
