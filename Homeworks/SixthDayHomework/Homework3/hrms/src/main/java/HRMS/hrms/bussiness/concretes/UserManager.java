package HRMS.hrms.bussiness.concretes;

import HRMS.hrms.bussiness.abstracts.UserService;
import HRMS.hrms.dataAccess.abstracts.ProductDao;
import HRMS.hrms.entities.concretes.Users;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserManager implements UserService {

    private ProductDao productDao;

    @Autowired
    public UserManager(ProductDao productDao){
        this.productDao=productDao;
    }
    @Override
    public List<Users> getAll() {
        return this.productDao.findAll();
    }
}
