package aluckens.dev.jenkingsDemo.rest;

import aluckens.dev.jenkingsDemo.model.Category;
import aluckens.dev.jenkingsDemo.model.enumeration.Type;
import aluckens.dev.jenkingsDemo.repositories.CategoryRepository;
import aluckens.dev.jenkingsDemo.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController("api/categories")
public class CategoryResource {
    @Autowired
    CategoryService categoryService;

    @GetMapping()
    public List<Category> getAllCategory() {
        return categoryService.getAllCats();
    }

    @GetMapping("id/{id}")
    public Category getCategoryById(@PathVariable("id") Integer id) {
        return categoryService.getAllCats().stream()
                .filter(cat -> cat.getId() == id).findFirst().get();
    }
}
