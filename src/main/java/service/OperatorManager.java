package service;

import pojo.Operator;

import java.util.List;

public interface OperatorManager {

    int addOperator(String nameOfOperator, String numberOfRole);

    int changeRoleOfOperatorById(String operatorId, String newRoleId);

    List<Operator> getOperators();
}
