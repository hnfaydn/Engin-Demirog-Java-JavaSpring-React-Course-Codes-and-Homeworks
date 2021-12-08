package kodlama.o.northwind.business.abstacts;

import kodlama.o.northwind.core.entities.User;
import kodlama.o.northwind.core.utilities.results.DataResult;
import kodlama.o.northwind.core.utilities.results.Result;
import kodlama.o.northwind.entities.concretes.Product;

public interface UserService {

    Result add(User user);

    DataResult<User> findByEmail(String email);
}
