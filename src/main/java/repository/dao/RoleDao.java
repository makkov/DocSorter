package repository.dao;

import pojo.Role;

import java.util.List;

public interface RoleDao {

    boolean addRole(Role role);

    boolean deleteRoleById(Integer id);

    boolean updateRoleById(Role role);

    Role getRoleById(Integer id);

    List<Role> getAllRolesWithId();
}
