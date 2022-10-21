package com.Narainox.ECart.Service;

import com.Narainox.ECart.Entity.Category;
import com.Narainox.ECart.Entity.Product;

import java.util.List;

public interface CategoryService {
    List<Category> getAll();
    List<Category> createCategory(Category category);
    List<Category> updateCategory(Category category,Integer categoryId);
    List<Category> deleteCategory(Integer categoryId);
    Category get(Integer categoryId);
}
