package com.HRMS.hrms.api.controllers;

import com.HRMS.hrms.bussiness.abstracts.EmployerService;
import com.HRMS.hrms.entities.concretes.Employer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/ec")
public class EmployerController {

    EmployerService employerService;

    @Autowired
    public EmployerController(EmployerService employerService) {
        this.employerService = employerService;
    }

    @GetMapping("/getall")
    public List<Employer> getAll(){
        return this.employerService.getAll();
    }
}
