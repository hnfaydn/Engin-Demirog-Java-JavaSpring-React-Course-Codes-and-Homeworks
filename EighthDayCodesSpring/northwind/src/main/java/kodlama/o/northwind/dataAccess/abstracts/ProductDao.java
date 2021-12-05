package kodlama.o.northwind.dataAccess.abstracts;

import kodlama.o.northwind.entities.concretes.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductDao extends JpaRepository<Product,Integer> {

    Product getByProductName(String productName);

    Product getByProductNameAndCategories_CategoryId(String productName, int categoryId);

    List<Product> getByProductNameOrCategories_CategoryId(String productName, int categoryId);

    List<Product> getByCategoriesIn(List<Integer> categories);

    List<Product> getByProductNameContains(String productName);

    List<Product> getByProductNameStartsWith(String productName);

    @Query("From Product where productName=:productName and categories=:categoryId ")
    List<Product> getByNameAndCategory(String productName,int categoryId);


}
