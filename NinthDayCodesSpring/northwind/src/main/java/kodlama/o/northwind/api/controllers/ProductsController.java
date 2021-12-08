package kodlama.o.northwind.api.controllers;

import kodlama.o.northwind.business.abstacts.ProductService;
import kodlama.o.northwind.core.utilities.results.DataResult;
import kodlama.o.northwind.core.utilities.results.Result;
import kodlama.o.northwind.core.utilities.results.SuccesDataResult;
import kodlama.o.northwind.entities.concretes.Product;
import kodlama.o.northwind.entities.dtos.ProductWithCategoryDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductsController {

    private ProductService productService;

    @Autowired
    public ProductsController(ProductService productService) {

        this.productService = productService;
    }



    @GetMapping("/getall")
    public DataResult<List<Product>> getAll(){

        return this.productService.getAll();
    }

    @PostMapping("/add")
    public Result add(@RequestBody Product product){
        return this.productService.add(product);
    }

    @GetMapping("/getByProductName")
    public DataResult<Product> getByProductName(@RequestParam String productName){
        return this.productService.getByProductName(productName);
    }

    @GetMapping("/getByProductNameAndCategories")
    public DataResult<Product> getByProductNameAndCategories(@RequestParam("productName") String productName,@RequestParam("categoryId") int categoryId){


        return this.productService.getByProductNameAndCategories_CategoryId(productName,categoryId);

    }

    @GetMapping("/getByProductNameContains")
    public DataResult<List<Product>> getByProductNameContains(@RequestParam String productName) {
        return this.productService.getByProductNameContains(productName);
    }

    @GetMapping("/getAllByPage")
    public DataResult<List<Product>> getAll(int pageNo,int pageSize){

        return this.productService.getAll(pageNo-1,pageSize);

    }

    @GetMapping("/getAllSortedDesc")
    public DataResult<List<Product>> getAllSorted(){
        return this.productService.getAllSorted();
    }

    @GetMapping("/getProductWithCategoryDetails")
    public DataResult<List<ProductWithCategoryDto>> getProductWithCategoryDetails(){

        return this.productService.getProductWithCategoryDetails();
    }
}
