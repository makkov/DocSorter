package service.serviceImpl;

import pojo.Role;
import repository.dao.RoleDao;
import repository.dao.daoImpl.RoleDaoImpl;
import service.RoleManager;

public class RoleManagerImpl implements RoleManager {

    RoleDao roleDao;

    public RoleManagerImpl() {
        this.roleDao = new RoleDaoImpl();
    }

    @Override
    public int addRole(String nameRole) {
        if (nameRole != null) {
            Role newRole = new Role(null, nameRole);
            roleDao.addRole(newRole);
            return 1;
        }
        return 0;
    }
}
