package service;

public interface OperatorManager {

    int addOperator(String nameOfOperator, Integer numberOfRole);

    int changeRoleOfOperatorById(Integer operatorId, Integer newRoleId);
}
