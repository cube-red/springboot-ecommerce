package com.ecommerce.controller;

import com.ecommerce.model.Category;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController()
public class CategoryController {

    private List<Category> categories = new ArrayList<>();

    @GetMapping("/public/categories")
    public List<Category> getCategories(){
        return categories;
    }

}
