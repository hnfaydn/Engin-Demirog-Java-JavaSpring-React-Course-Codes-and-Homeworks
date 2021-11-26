package com.HRMS.hrms.bussiness.abstracts;

import com.HRMS.hrms.entities.concretes.Employer;

import java.util.List;

public interface EmployerService {

    List<Employer> getAll();
}
