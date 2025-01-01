package com.ecommerce.service;

import com.ecommerce.model.Category;
import org.springframework.stereotype.Service;

import java.util.List;


public interface CategoryService {

    List<Category> getAllCategories();
    void createCategory(Category category);
}
