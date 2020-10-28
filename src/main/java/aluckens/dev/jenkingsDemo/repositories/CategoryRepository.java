package aluckens.dev.jenkingsDemo.repositories;

import aluckens.dev.jenkingsDemo.model.Category;
import aluckens.dev.jenkingsDemo.model.enumeration.Type;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;


public class CategoryRepository {
  public static final  List<Category> categories = Arrays.asList(
            new Category(1,"Boisson Energetiques", Type.PRODUCT),
            new Category(2,"Boisson Gazeuzes", Type.PRODUCT),
            new Category(3,"Recharge", Type.SERVICE),
            new Category(4,"Coiffure", Type.SERVICE));

}
