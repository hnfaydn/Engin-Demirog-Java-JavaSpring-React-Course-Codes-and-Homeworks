package com.HRMS.hrms.bussiness.userBussiness.abstracts;

import com.HRMS.hrms.core.results.Result;
import com.HRMS.hrms.entities.userEntities.concretes.SystemEmployee;

import java.util.List;

public interface SystemEmployeeService {

    List<SystemEmployee> getAll();

    Result add(SystemEmployee systemEmployee);
}
