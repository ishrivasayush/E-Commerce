package com.Narainox.ECart.Controller;

import com.Narainox.ECart.Entity.Product;
import com.Narainox.ECart.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api")
public class ProductController {

    @Autowired
    ProductService productService;

    @GetMapping("/all")
    public List<Product> getAll()
    {
        return productService.getAll();
    }

    @GetMapping("/product/{productId}")
    public Product get(@PathVariable Integer productId)
    {
        return productService.get(productId);
    }

    @PostMapping("/product")
    public List<Product> createProduct(@RequestBody Product product)
    {
        return productService.createProduct(product);
    }

    @DeleteMapping("/product/{productId}")
    public List<Product> deleteProduct(@PathVariable Integer productId)
    {
        return productService.deleteProduct(productId);
    }

    @PutMapping("/product/{productId}")
    public List<Product> updateProduct(@RequestBody Product product,@PathVariable Integer productId)
    {
        return productService.updateProduct(product,productId);
    }
}
