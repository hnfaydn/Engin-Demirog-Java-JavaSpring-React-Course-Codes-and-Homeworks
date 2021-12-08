package kodlama.o.northwind.core.dataAccess;

import kodlama.o.northwind.core.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User,Integer> {

    User findByEmail(String email);
}
