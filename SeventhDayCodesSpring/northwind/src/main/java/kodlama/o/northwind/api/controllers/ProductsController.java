package kodlama.o.northwind.api.controllers;

import kodlama.o.northwind.business.abstacts.ProductService;
import kodlama.o.northwind.core.utilities.results.DataResult;
import kodlama.o.northwind.core.utilities.results.Result;
import kodlama.o.northwind.entities.concretes.Product;
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

}
