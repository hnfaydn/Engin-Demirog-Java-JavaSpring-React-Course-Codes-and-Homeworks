package HRMS.hrms.dataAccess.abstracts;

import HRMS.hrms.entities.concretes.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductDao extends JpaRepository<Users,Integer> {
}
