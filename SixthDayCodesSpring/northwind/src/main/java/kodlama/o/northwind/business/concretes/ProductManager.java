package kodlama.o.northwind.business.concretes;

import kodlama.o.northwind.business.abstacts.ProductService;
import kodlama.o.northwind.dataAccess.abstracts.ProductDao;
import kodlama.o.northwind.entities.concretes.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductManager implements ProductService {
    private ProductDao productDao;

    @Autowired
    public ProductManager(ProductDao productDao) {
        this.productDao = productDao;
    }

    @Override
    public List<Product> getAll() {
        return this.productDao.findAll();
    }
}
