package com.HRMS.hrms.api.jobTitleControllers;

import com.HRMS.hrms.bussiness.jobTitleBussiness.abstrats.JobTitleService;
import com.HRMS.hrms.entities.userEntities.concretes.JobTitle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/jobtitle")
public class JobTitleController {
    JobTitleService jobTitleService;

    @Autowired
    public JobTitleController(JobTitleService jobTitleService) {
        this.jobTitleService = jobTitleService;
    }

    @GetMapping("/getall")
    public List<JobTitle> getAll(){
        return this.jobTitleService.getAll();
    }


}
