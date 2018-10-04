package service;

public interface DocumentFeaturesManager {

    int addCategoryOfDocument(String nameCategory);
    int addFieldsOfCategory(Integer categoryId, String newField);
}
