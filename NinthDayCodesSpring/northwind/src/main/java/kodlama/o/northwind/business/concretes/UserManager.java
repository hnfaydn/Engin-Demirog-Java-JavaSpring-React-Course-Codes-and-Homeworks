package kodlama.o.northwind.business.concretes;

import kodlama.o.northwind.business.abstacts.UserService;
import kodlama.o.northwind.core.dataAccess.UserDao;
import kodlama.o.northwind.core.entities.User;
import kodlama.o.northwind.core.utilities.results.DataResult;
import kodlama.o.northwind.core.utilities.results.Result;
import kodlama.o.northwind.core.utilities.results.SuccesDataResult;
import kodlama.o.northwind.core.utilities.results.SuccesResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserManager implements UserService {
    private UserDao userDao;

    @Autowired
    public UserManager(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public Result add(User user) {
        this.userDao.save(user);
        return new SuccesResult("Kullanıcı eklendi");
    }

    @Override
    public DataResult<User> findByEmail(String email) {
        return new SuccesDataResult<User>(this.userDao.findByEmail(email),"Kullanıcı bulundu");
    }
}
