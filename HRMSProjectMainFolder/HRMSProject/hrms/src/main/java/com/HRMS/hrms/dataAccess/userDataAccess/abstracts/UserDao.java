package com.HRMS.hrms.dataAccess.userDataAccess.abstracts;

import com.HRMS.hrms.entities.userEntities.abstracts.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserDao extends JpaRepository<User, Integer> {

    List<User> findByEmail(String email);
}
