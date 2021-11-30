package com.HRMS.hrms.dataAccess.jobTitleDataAccess.abstracts;

import com.HRMS.hrms.entities.userEntities.concretes.JobTitle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JobTitleDao extends JpaRepository<JobTitle, Integer> {

}
