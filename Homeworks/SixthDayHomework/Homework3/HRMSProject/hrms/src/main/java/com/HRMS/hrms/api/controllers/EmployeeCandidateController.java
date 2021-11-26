package com.HRMS.hrms.api.controllers;

import com.HRMS.hrms.bussiness.abstracts.EmployeeCandidateService;
import com.HRMS.hrms.entities.concretes.EmployeeCandidate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/ecc")
public class EmployeeCandidateController {

    EmployeeCandidateService employeeCandidateService;

    @Autowired
    public EmployeeCandidateController(EmployeeCandidateService employeeCandidateService) {
        this.employeeCandidateService = employeeCandidateService;
    }

    @GetMapping("/getall")
    public List<EmployeeCandidate> getAll(){

        return this.employeeCandidateService.getAll();
    }
}
