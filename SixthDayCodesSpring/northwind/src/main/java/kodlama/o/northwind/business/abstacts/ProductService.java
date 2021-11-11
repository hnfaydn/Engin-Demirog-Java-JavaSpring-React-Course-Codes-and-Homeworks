package kodlama.o.northwind.business.abstacts;

import kodlama.o.northwind.entities.concretes.Product;

import java.util.List;

public interface ProductService {
    List<Product> getAll();
}
