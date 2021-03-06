package repository.dao;

import pojo.Value;

import java.util.List;

public interface ValueDao {

    public boolean addValue(Value value);

    public boolean updateValueById(Integer id);

    List<Value> getValueById(Integer documentId);
//    Value getValueByDocIdAndFieldId(Integer documentId, Integer valueId);
}
