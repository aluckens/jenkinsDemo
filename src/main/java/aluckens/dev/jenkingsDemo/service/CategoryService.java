package aluckens.dev.jenkingsDemo.service;

import aluckens.dev.jenkingsDemo.model.Category;
import aluckens.dev.jenkingsDemo.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {
    @Autowired
    CategoryRepository categoryRepository;

    public List<Category> getAllCats() {
        return categoryRepository.categories;
    }
}
