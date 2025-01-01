package com.ecommerce.service;

import com.ecommerce.model.Category;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService{
    private List<Category> list = new ArrayList<>();

    @Override
    public List<Category> getAllCategories() {
        return list;
    }

    @Override
    public void createCategory(Category category) {
        list.add(category);
    }
}