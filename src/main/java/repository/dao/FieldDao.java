package repository.dao;

import pojo.Field;

import java.util.List;

public interface FieldDao {

    boolean addField(Field field);

    boolean deleteFieldById(Integer id);

    boolean updateFieldById(Field field);

    Field getFieldById(Integer id);

    List<Field> getAllFieldsWithId();

}
