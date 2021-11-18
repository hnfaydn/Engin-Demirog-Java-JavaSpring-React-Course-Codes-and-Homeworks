package kodlama.o.northwind.business.abstacts;

import kodlama.o.northwind.core.utilities.results.DataResult;
import kodlama.o.northwind.core.utilities.results.Result;
import kodlama.o.northwind.entities.concretes.Product;

import java.util.List;

public interface ProductService {
    DataResult<List<Product>> getAll();

    Result add(Product product);
}
