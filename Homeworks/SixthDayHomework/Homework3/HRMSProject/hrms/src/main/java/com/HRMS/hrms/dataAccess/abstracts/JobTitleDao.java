package com.HRMS.hrms.dataAccess.abstracts;

import com.HRMS.hrms.entities.concretes.JobTitle;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobTitleDao extends JpaRepository<JobTitle, Integer> {

}
