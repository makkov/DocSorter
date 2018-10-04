package service.serviceImpl;

import pojo.Operator;
import repository.dao.OperatorDao;
import repository.dao.daoImpl.OperatorDaoImpl;
import repository.dao.RoleDao;
import repository.dao.daoImpl.RoleDaoImpl;
import service.OperatorManager;

public class OperatorManagerImpl implements OperatorManager {

    OperatorDao operatorDao;
    RoleDao roleDao;

    public OperatorManagerImpl() {
        this.operatorDao = new OperatorDaoImpl();
        this.roleDao = new RoleDaoImpl();
    }

    @Override
    public int addOperator(String nameOfOperator, Integer numberOfRole) {
        if (nameOfOperator != null && numberOfRole != null) {
            Operator newOperator = new Operator(null, nameOfOperator, numberOfRole);
            operatorDao.addOperator(newOperator);
            return 1;
        }
        return 0;
    }

    @Override
    public int changeRoleOfOperatorById(Integer operatorId, Integer newRoleId) {
        if (operatorId != null && newRoleId != null) {
            Operator operator = operatorDao.getOperatorById(operatorId);
            Operator newOperator = new Operator(operator.getId(), operator.getName(), newRoleId);
            operatorDao.updateRoleOfOperatorById(newOperator);
            return 1;
        }
        return 0;
    }
}
