package kodlama.o.northwind.business.concretes;

import kodlama.o.northwind.business.abstacts.ProductService;
import kodlama.o.northwind.core.utilities.results.DataResult;
import kodlama.o.northwind.core.utilities.results.Result;
import kodlama.o.northwind.core.utilities.results.SuccesDataResult;
import kodlama.o.northwind.core.utilities.results.SuccesResult;
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
        super();
        this.productDao = productDao;
    }

    @Override
    public DataResult<List<Product>> getAll() {

        return new SuccesDataResult<List<Product>>(this.productDao.findAll(),"Data Listelendi");

    }

    @Override
    public Result add(Product product) {

        this.productDao.save(product);
        return new SuccesResult("Ürün eklendi");
    }
}
