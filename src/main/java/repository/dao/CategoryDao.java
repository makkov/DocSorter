package repository.dao;

import pojo.Category;

import java.util.List;

public interface CategoryDao {

    boolean addCategory(Category category);

    boolean deleteCategoryById(Integer id);

    boolean updateCategoryById(Category category);

    Category getCategoryById(Integer id);

    List<Category> getAllCategoriesWithId();
}
