package kodlama.o.northwind.dataAccess.abstracts;

import kodlama.o.northwind.entities.concretes.Product;
import kodlama.o.northwind.entities.dtos.ProductWithCategoryDto;
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


    @Query("Select new kodlama.o.northwind.entities.dtos.ProductWithCategoryDto(p.id,p.productName,c.categoryName)" +
            " From Category c Inner Join c.products p")
    List<ProductWithCategoryDto> getProductWithCategoryDetails();

    //select p.product_id,p.product_name,c.category_name,p.unit_price  from products p inner join categories c
    //on p.category_id=c.category_id   (SQL Query code)

}
