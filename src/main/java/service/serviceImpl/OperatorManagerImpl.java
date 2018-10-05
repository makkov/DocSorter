package service.serviceImpl;

import pojo.Operator;
import repository.dao.OperatorDao;
import repository.dao.daoImpl.OperatorDaoImpl;
import repository.dao.RoleDao;
import repository.dao.daoImpl.RoleDaoImpl;
import service.OperatorManager;

import java.util.List;

public class OperatorManagerImpl implements OperatorManager {

    OperatorDao operatorDao;
    RoleDao roleDao;

    public OperatorManagerImpl() {
        this.operatorDao = new OperatorDaoImpl();
        this.roleDao = new RoleDaoImpl();
    }

    @Override
    public int addOperator(String nameOfOperator, String numberOfRole) {
        if (nameOfOperator != null && numberOfRole != null) {
            Operator newOperator = new Operator(null, nameOfOperator, Integer.parseInt(numberOfRole));
            operatorDao.addOperator(newOperator);
            return 1;
        }
        return 0;
    }

    @Override
    public int changeRoleOfOperatorById(String operatorId, String newRoleId) {
        if (operatorId != null && newRoleId != null) {
            Operator operator = operatorDao.getOperatorById(Integer.parseInt(operatorId));
            Operator newOperator = new Operator(operator.getId(), operator.getName(), Integer.parseInt(newRoleId));
            operatorDao.updateRoleOfOperatorById(newOperator);
            return 1;
        }
        return 0;
    }

    @Override
    public List<Operator> getOperators() {
        return operatorDao.getAllOperatorsWithId();
    }
}
