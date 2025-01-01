package com.ecommerce.controller;

import com.ecommerce.model.Category;
import com.ecommerce.service.CategoryService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController()
public class CategoryController {

    private List<Category> categories = new ArrayList<>();

    private CategoryService categoryService;

    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @GetMapping("/public/categories")
    public List<Category> getCategories(){
        return categoryService.getAllCategories();
    }

    @PostMapping("/public/categories")
    public String createCategory(@RequestBody Category category){
        categoryService.createCategory(category);
        return "Category Added Succesfully";
    }



}
