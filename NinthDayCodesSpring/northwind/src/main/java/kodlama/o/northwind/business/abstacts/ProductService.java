package kodlama.o.northwind.business.abstacts;

import kodlama.o.northwind.core.utilities.results.DataResult;
import kodlama.o.northwind.core.utilities.results.Result;
import kodlama.o.northwind.entities.concretes.Product;
import kodlama.o.northwind.entities.dtos.ProductWithCategoryDto;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProductService {
    DataResult<List<Product>> getAll();

    DataResult<List<Product>> getAll(int pageNo,int pageSize);

    DataResult<List<Product>> getAllSorted();

    Result add(Product product);

    DataResult<Product> getByProductName(String productName);

    DataResult<Product> getByProductNameAndCategories_CategoryId(String productName, int categoryId);

    DataResult<List<Product>>getByProductNameOrCategories_CategoryId(String productName, int categoryId);

    DataResult<List<Product>> getByCategoriesIn(List<Integer> categories);

    DataResult<List<Product>> getByProductNameContains(String productName);

    DataResult<List<Product>> getByProductNameStartsWith(String productName);

    DataResult<List<Product>> getByNameAndCategory(String productName,int categoryId);

    DataResult<List<ProductWithCategoryDto>>getProductWithCategoryDetails();


}
