package aluckens.dev.jenkingsDemo.rest;

import aluckens.dev.jenkingsDemo.model.Category;
import aluckens.dev.jenkingsDemo.model.enumeration.Type;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController("api/categories")
public class CategoryResource {
    List<Category> categories = Arrays.asList(
            new Category("Boisson Energetiques", Type.PRODUCT),
            new Category("Boisson Gazeuzes", Type.PRODUCT),
            new Category("Recharge", Type.SERVICE),
            new Category("Coiffure", Type.SERVICE));

    @GetMapping()
    public List<Category> getAllCategory() {
        return categories;
    }

    @GetMapping("id/{id}")
    public Category getCategoryById(@PathVariable("id") Integer id) {
        return categories.stream()
                .filter(cat -> cat.getId() == id).findFirst().get();
    }
}
