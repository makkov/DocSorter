package service.serviceImpl;

import pojo.Category;
import pojo.Field;
import repository.dao.CategoryDao;
import repository.dao.FieldDao;
import repository.dao.daoImpl.CategoryDaoImpl;
import repository.dao.daoImpl.FieldDaoImpl;
import service.DocumentFeaturesManager;

public class DocumentFeaturesManagerImpl implements DocumentFeaturesManager {

    CategoryDao categoryDao;
    FieldDao fieldDao;

    public DocumentFeaturesManagerImpl() {
        this.categoryDao = new CategoryDaoImpl();
        this.fieldDao = new FieldDaoImpl();
    }


    @Override
    public int addCategoryOfDocument(String nameCategory) {
        if (nameCategory != null) {
            Category newCategory = new Category(null, nameCategory);
            categoryDao.addCategory(newCategory);
            return 1;
        }
        return 0;
    }

    @Override
    public int addFieldsOfCategory(Integer categoryId, String newField) {
        if (categoryId != null && newField != null) {
            Field newFieldInDocument = new Field(null, newField, categoryId);
            fieldDao.addField(newFieldInDocument);
            return 1;
        }
        return 0;
    }
}
