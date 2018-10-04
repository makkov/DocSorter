package repository.dao.daoImpl;

import pojo.Role;
import repository.connectionManager.ConnectionManager;
import repository.connectionManager.ConnectionManagerJdbcImpl;
import repository.dao.RoleDao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class RoleDaoImpl implements RoleDao {

    private static ConnectionManager connectionManager = ConnectionManagerJdbcImpl.getInstance();

    @Override
    public boolean addRole(Role role) {
        try (Connection connection = connectionManager.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(
                     "INSERT INTO role VALUES (DEFAULT, ?)")) {
            preparedStatement.setString(1, role.getName());
            preparedStatement.execute();
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    @Override
    public boolean deleteRoleById(Integer id) {
        try (Connection connection = connectionManager.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(
                     "DELETE FROM role WHERE id=?")) {
            preparedStatement.setInt(1, id);
            preparedStatement.execute();
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    @Override
    public boolean updateRoleById(Role role) {
        try (Connection connection = connectionManager.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(
                     "UPDATE role SET name=?" +
                             "WHERE id=?");) {
            preparedStatement.setString(1, role.getName());
            preparedStatement.setInt(2, role.getId());
            preparedStatement.execute();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public Role getRoleById(Integer id) {
        try (Connection connection = connectionManager.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(
                     "SELECT * FROM role WHERE id = ?")) {
            preparedStatement.setInt(1, id);
            try (ResultSet resultSet = preparedStatement.executeQuery();) {
                if (resultSet.next()) {
                    return new Role(
                            resultSet.getInt(1),
                            resultSet.getString(2));
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<Role> getAllRolesWithId() {
        List<Role> result = null;
        try (Connection connection = connectionManager.getConnection();
             Statement statement = connection.createStatement()) {
            try (ResultSet resultSet = statement.executeQuery("SELECT * FROM role");) {
                result = new ArrayList<>();
                while (resultSet.next()) {
                    result.add(new Role(
                            resultSet.getInt(1),
                            resultSet.getString(2)));
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }
}
