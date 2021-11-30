package com.HRMS.hrms.bussiness.userBussiness.abstracts;

import com.HRMS.hrms.core.results.Result;
import com.HRMS.hrms.entities.userEntities.concretes.Employer;

import java.util.List;

public interface EmployerService {

    List<Employer> getAll();

    Result add(Employer employer);
}
