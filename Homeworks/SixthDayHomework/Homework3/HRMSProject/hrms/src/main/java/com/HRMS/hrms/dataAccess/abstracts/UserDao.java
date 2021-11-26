package com.HRMS.hrms.dataAccess.abstracts;

import com.HRMS.hrms.entities.abstracts.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User, Integer> {
}
