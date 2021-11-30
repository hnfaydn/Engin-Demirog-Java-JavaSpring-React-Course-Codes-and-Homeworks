package com.HRMS.hrms.bussiness.userBussiness.abstracts;

import com.HRMS.hrms.entities.userEntities.abstracts.User;

import java.util.List;

public interface UserService {

    List<User> getAll();
}
