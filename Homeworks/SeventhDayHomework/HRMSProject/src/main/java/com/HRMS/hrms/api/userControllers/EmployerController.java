package com.HRMS.hrms.api.userControllers;

import com.HRMS.hrms.bussiness.userBussiness.abstracts.EmployerService;
import com.HRMS.hrms.entities.userEntities.concretes.Employer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/employer")
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
