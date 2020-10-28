package aluckens.dev.jenkingsDemo;

import aluckens.dev.jenkingsDemo.service.CategoryService;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JenkingsDemoApplicationTests {

	@Autowired
	CategoryService categoryService;
	@Test
	void contextLoads() {
	}

	@Test
	void getAllCats() {
		 Assertions.assertThat(categoryService.getAllCats().size()).isEqualTo(4);
	}
}
