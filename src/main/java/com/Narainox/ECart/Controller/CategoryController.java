package com.Narainox.ECart.Controller;

import com.Narainox.ECart.Entity.Category;
import com.Narainox.ECart.Service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/category")
@CrossOrigin("*")
public class CategoryController {

    @Autowired
    CategoryService categoryService;

    @GetMapping("/all")
    public List<Category> getAll()
    {
        return categoryService.getAll();
    }

    @GetMapping("/category/{categoryId}")
    public Category get(@PathVariable Integer categoryId)
    {
        return categoryService.get(categoryId);
    }

    @PostMapping("/category")
    public List<Category> createProduct(@RequestBody Category category)
    {
        return categoryService.createCategory(category);
    }

    @DeleteMapping("/category/{categoryId}")
    public List<Category> deleteProduct(@PathVariable Integer categoryId)
    {
        return categoryService.deleteCategory(categoryId);
    }

    @PutMapping("/category/{categoryId}")
    public List<Category> updateProduct(@RequestBody Category category,@PathVariable Integer categoryId)
    {
        return categoryService.updateCategory(category,categoryId);
    }
}

