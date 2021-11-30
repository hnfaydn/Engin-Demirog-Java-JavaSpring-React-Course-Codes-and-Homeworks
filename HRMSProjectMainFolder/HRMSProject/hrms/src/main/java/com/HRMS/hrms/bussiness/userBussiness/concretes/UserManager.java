package com.HRMS.hrms.bussiness.userBussiness.concretes;

import com.HRMS.hrms.bussiness.userBussiness.abstracts.UserService;
import com.HRMS.hrms.dataAccess.userDataAccess.abstracts.UserDao;
import com.HRMS.hrms.entities.userEntities.abstracts.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserManager implements UserService {

    UserDao userDao;

    @Autowired
    public UserManager(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public List<User> getAll() {

        return this.userDao.findAll();
    }
}
