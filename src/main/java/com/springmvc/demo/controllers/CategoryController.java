package com.springmvc.demo.controllers;

import ch.qos.logback.core.CoreConstants;
import com.springmvc.demo.models.Category;
import com.springmvc.demo.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(path="categories")
//http:localhost:8080/categories
public class CategoryController {
    // inject "CategoryRepository"
    @Autowired
    private CategoryRepository categoryRepository;
    // return name of "jsp file"
    // http:localhost:8080/categories
    @RequestMapping(value="", method= RequestMethod.GET)
    public String getAllcategories(ModelMap modelMap) {
        // data send to jsp => ModelMap
        // send data from Controller to View
        Iterable<Category> categories = categoryRepository.findAll();
        modelMap.addAttribute("categories",categories);
        System.out.println("haha");
        return "category";
    }
}
