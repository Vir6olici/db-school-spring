package com.db.school.demo.products;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductServiceContract productService;

    @GetMapping("/productByCode")
    public Product getProduct(@RequestParam("cod") String cod) {
        return productService.getProduct(cod);
    }
    @PostMapping("/insertProduct")
    public void createProduct(@RequestBody Product product){  productService.insert(product); }
    @GetMapping("/allProducts")
    public List<Product> getAll(){
        return productService.getAll();
    }
    @PutMapping("/updateProduct")
    public void updateProduct(@RequestParam("cod") String cod , @RequestBody String newName){  productService.update(cod,newName);}
    @DeleteMapping("/deleteProduct")
    public int deleteProduct(@RequestParam("cod") String cod){return productService.delete(cod);}

}

