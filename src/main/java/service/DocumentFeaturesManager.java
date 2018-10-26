package service;

import pojo.Category;
import pojo.Field;

import java.util.List;

public interface DocumentFeaturesManager {

    int addCategoryOfDocument(String nameCategory);

    int addFieldsOfCategory(String categoryId, String newField);

    List<Category> getСategories();

    List<Field> getFieldByIdCategory(String id);
}
