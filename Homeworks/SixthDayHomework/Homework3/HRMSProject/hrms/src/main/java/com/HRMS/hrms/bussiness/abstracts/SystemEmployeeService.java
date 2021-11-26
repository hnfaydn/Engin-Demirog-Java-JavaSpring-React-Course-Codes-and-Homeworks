package com.HRMS.hrms.bussiness.abstracts;

import com.HRMS.hrms.entities.concretes.SystemEmployee;

import java.util.List;

public interface SystemEmployeeService {

    List<SystemEmployee> getAll();
}
