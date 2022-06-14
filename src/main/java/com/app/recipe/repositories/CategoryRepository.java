package com.app.recipe.repositories;

import com.app.recipe.domian.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
