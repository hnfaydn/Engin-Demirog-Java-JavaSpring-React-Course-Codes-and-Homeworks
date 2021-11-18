package kodlama.o.northwind.dataAccess.abstracts;

import kodlama.o.northwind.entities.concretes.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductDao extends JpaRepository<Product,Integer> {
}
