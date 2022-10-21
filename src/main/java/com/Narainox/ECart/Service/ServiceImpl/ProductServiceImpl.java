package com.Narainox.ECart.Service.ServiceImpl;

import com.Narainox.ECart.Entity.Product;
import com.Narainox.ECart.Repository.ProductRepo;
import com.Narainox.ECart.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    ProductRepo productRepo;

    @Override
    public List<Product> getAll() {
        return productRepo.findAll();
    }

    @Override
    public List<Product> createProduct(Product product) {
         productRepo.save(product);
         return productRepo.findAll();
    }

    @Override
    public List<Product> updateProduct(Product product, Integer productId) {
        if (productRepo.existsById(productId))
        {
            productRepo.deleteById(productId);
            productRepo.save(product);
        }
        return productRepo.findAll();
    }

    @Override
    public List<Product> deleteProduct(Integer productId) {
        productRepo.deleteById(productId);
        return productRepo.findAll();
    }

    @Override
    public Product get(Integer productId) {
        return productRepo.findById(productId).get();
    }
}
