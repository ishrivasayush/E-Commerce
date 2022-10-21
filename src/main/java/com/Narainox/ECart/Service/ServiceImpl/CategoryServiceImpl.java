package com.Narainox.ECart.Service.ServiceImpl;

import com.Narainox.ECart.Entity.Category;
import com.Narainox.ECart.Repository.CategoryRepo;
import com.Narainox.ECart.Service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    CategoryRepo categoryRepo;

    @Override
    public List<Category> getAll() {
        return categoryRepo.findAll();
    }

    @Override
    public List<Category> createCategory(Category category) {
        categoryRepo.save(category);
        return categoryRepo.findAll();
    }

    @Override
    public List<Category> updateCategory(Category category, Integer categoryId) {
        if (categoryRepo.existsById(categoryId))
        {
            categoryRepo.deleteById(categoryId);
            categoryRepo.save(category);
        }
        return categoryRepo.findAll();
    }

    @Override
    public List<Category> deleteCategory(Integer categoryId) {
        categoryRepo.deleteById(categoryId);
        return categoryRepo.findAll();
    }

    @Override
    public Category get(Integer categoryId) {
        return categoryRepo.findById(categoryId).get();
    }
}
