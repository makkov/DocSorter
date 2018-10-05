package repository.dao;

import pojo.Operator;

import java.util.List;

public interface OperatorDao {

    boolean addOperator(Operator operator);

    boolean deleteOperatorById(Integer id);

    boolean updateRoleOfOperatorById(Operator operator);

    boolean updateNameOfOperatorById(Operator operator);

    Operator getOperatorById(Integer id);

    List<Operator> getAllOperatorsWithId();

    Operator getOperatorByLogin(String login);
}
