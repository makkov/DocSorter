package repository.dao.daoImpl;

import pojo.Operator;
import repository.connectionManager.ConnectionManager;
import repository.connectionManager.ConnectionManagerJdbcImpl;
import repository.dao.OperatorDao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class OperatorDaoImpl implements OperatorDao {

    private static ConnectionManager connectionManager = ConnectionManagerJdbcImpl.getInstance();


    @Override
    public boolean addOperator(Operator operator) {
        try (Connection connection = connectionManager.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(
                     "INSERT INTO operator VALUES (DEFAULT, ?, ?, ?, ?, ?)")) {
            preparedStatement.setString(1, operator.getLogin());
            preparedStatement.setString(2, operator.getPassword());
            preparedStatement.setString(3, operator.getName());
            preparedStatement.setBoolean(4, operator.getActive());
            preparedStatement.setInt(5, operator.getRole());
            preparedStatement.execute();
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    @Override
    public boolean deleteOperatorById(Integer id) {
        try (Connection connection = connectionManager.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(
                     "DELETE FROM operator WHERE id=?")) {
            preparedStatement.setInt(1, id);
            preparedStatement.execute();
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    @Override
    public boolean updateRoleOfOperatorById(Operator operator) {
        try (Connection connection = connectionManager.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(
                     "UPDATE operator SET role_id=?" +
                             "WHERE id=?");) {
            preparedStatement.setInt(1, operator.getRole());
            preparedStatement.setInt(2, operator.getId());
            preparedStatement.execute();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean updateNameOfOperatorById(Operator operator) {
        try (Connection connection = connectionManager.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(
                     "UPDATE operator SET name=?" +
                             "WHERE id=?");) {
            preparedStatement.setString(1, operator.getName());
            preparedStatement.setInt(2, operator.getId());
            preparedStatement.execute();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public Operator getOperatorById(Integer id) {
        try (Connection connection = connectionManager.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(
                     "SELECT * FROM operator WHERE id = ?")) {
            preparedStatement.setInt(1, id);
            try (ResultSet resultSet = preparedStatement.executeQuery();) {
                if (resultSet.next()) {
                    return new Operator(
                            resultSet.getInt(1),
                    resultSet.getString(2),
                    resultSet.getString(3),
                    resultSet.getString(4),
                    resultSet.getBoolean(5),
                    resultSet.getInt(6));
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
    public List<Operator> getAllOperatorsWithId() {
        List<Operator> result = null;
        try (Connection connection = connectionManager.getConnection();
             Statement statement = connection.createStatement()) {
            try (ResultSet resultSet = statement.executeQuery("SELECT * FROM operator");) {
                result = new ArrayList<>();
                while (resultSet.next()) {
                    result.add(new Operator(
                            resultSet.getInt(1),
                    resultSet.getString(2),
                    resultSet.getString(3),
                    resultSet.getString(4),
                    resultSet.getBoolean(5),
                    resultSet.getInt(6)));
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }

    @Override
    public Operator getOperatorByLogin(String login) {
        try (Connection connection = connectionManager.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(
                     "SELECT * FROM operator WHERE login = ?")) {
            preparedStatement.setString(1, login);
            try (ResultSet resultSet = preparedStatement.executeQuery();) {
                if (resultSet.next()) {
                    return new Operator(
                            resultSet.getInt(1),
                            resultSet.getString(2),
                            resultSet.getString(3),
                            resultSet.getString(4),
                            resultSet.getBoolean(5),
                            resultSet.getInt(6));
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
