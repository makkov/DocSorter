package service.serviceImpl;

import pojo.Operator;
import repository.dao.OperatorDao;
import repository.dao.daoImpl.OperatorDaoImpl;
import service.LoginManager;
import utils.UtilMD5;

import java.sql.SQLException;

public class LoginManagerImpl implements LoginManager {

    OperatorDao operatorDao = new OperatorDaoImpl();

    @Override
    public int getRole(String login) {
        Operator operator;
        if (login != null) {
            operator = operatorDao.getOperatorByLogin(login);
            if (operator == null){
                return 0;
            }
            return operator.getRole();
        }
        return 0;
    }

    @Override
    public boolean checkAuth(String login, String password) {
        Operator operator;
        if (login != null) {
            operator = operatorDao.getOperatorByLogin(login);
            if (operator != null){
                if (operator.getPassword().equals(UtilMD5.md5Custom(password)))
                    return true;
            } else {
                return false;
            }
        }
        return false;
    }
}
