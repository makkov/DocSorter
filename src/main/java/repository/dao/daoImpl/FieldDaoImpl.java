package repository.dao.daoImpl;

import pojo.Field;
import repository.connectionManager.ConnectionManager;
import repository.connectionManager.ConnectionManagerJdbcImpl;
import repository.dao.FieldDao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class FieldDaoImpl implements FieldDao {

    private static ConnectionManager connectionManager = ConnectionManagerJdbcImpl.getInstance();

    @Override
    public boolean addField(Field field) {
        try (Connection connection = connectionManager.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(
                     "INSERT INTO field VALUES (DEFAULT, ?, ?)")) {
            preparedStatement.setString(1, field.getName());
            preparedStatement.setInt(2, field.getCategory());
            preparedStatement.execute();
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    @Override
    public boolean deleteFieldById(Integer id) {
        try (Connection connection = connectionManager.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(
                     "DELETE FROM field WHERE id=?")) {
            preparedStatement.setInt(1, id);
            preparedStatement.execute();
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    @Override
    public boolean updateFieldById(Field field) {
        try (Connection connection = connectionManager.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(
                     "UPDATE field SET name=?" +
                             "WHERE id=?");) {
            preparedStatement.setString(1, field.getName());
            preparedStatement.setInt(2, field.getId());
            preparedStatement.execute();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public Field getFieldById(Integer id) {
        try (Connection connection = connectionManager.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(
                     "SELECT * FROM field WHERE id = ?")) {
            preparedStatement.setInt(1, id);
            try (ResultSet resultSet = preparedStatement.executeQuery();) {
                if (resultSet.next()) {
                    return new Field(
                            resultSet.getInt(1),
                            resultSet.getString(2),
                            resultSet.getInt(3));
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
    public List<Field> getAllFieldsWithId() {
        List<Field> result = null;
        try (Connection connection = connectionManager.getConnection();
             Statement statement = connection.createStatement()) {
            try (ResultSet resultSet = statement.executeQuery("SELECT * FROM field");) {
                result = new ArrayList<>();
                while (resultSet.next()) {
                    result.add(new Field(
                            resultSet.getInt(1),
                            resultSet.getString(2),
                            resultSet.getInt(3)));
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
