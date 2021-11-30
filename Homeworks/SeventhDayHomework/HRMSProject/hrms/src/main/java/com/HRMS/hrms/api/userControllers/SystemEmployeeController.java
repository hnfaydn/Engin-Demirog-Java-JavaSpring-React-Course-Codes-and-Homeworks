package com.HRMS.hrms.api.userControllers;

import com.HRMS.hrms.bussiness.userBussiness.abstracts.SystemEmployeeService;
import com.HRMS.hrms.entities.userEntities.concretes.SystemEmployee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/systememployee")
public class SystemEmployeeController {

    SystemEmployeeService systemEmployeeService;

    @Autowired
    public SystemEmployeeController(SystemEmployeeService systemEmployeeService) {
        this.systemEmployeeService = systemEmployeeService;
    }

    @GetMapping("/getall")
    public List<SystemEmployee> getAll(){

        return this.systemEmployeeService.getAll();
    }
}
