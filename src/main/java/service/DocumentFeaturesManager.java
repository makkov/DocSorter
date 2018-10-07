package service;

import pojo.Category;

import java.util.List;

public interface DocumentFeaturesManager {

    int addCategoryOfDocument(String nameCategory);

    int addFieldsOfCategory(Integer categoryId, String newField);

    List<Category> getСategories();
}
