package com.Narainox.ECart.Service;

import com.Narainox.ECart.Entity.Product;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;

public interface ProductService {
    List<Product> getAll();
    List<Product> createProduct(Product product);
    List<Product> updateProduct(Product product,Integer productId);
    List<Product> deleteProduct(Integer productId);
    Product get(Integer productId);
}
