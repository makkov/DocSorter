package repository.dao.daoImpl;

import pojo.Value;
import repository.connectionManager.ConnectionManager;
import repository.connectionManager.ConnectionManagerJdbcImpl;
import repository.dao.ValueDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ValueDaoImpl implements ValueDao {

    private static ConnectionManager connectionManager = ConnectionManagerJdbcImpl.getInstance();

    @Override
    public boolean addValue(Value value) {
        try (Connection connection = connectionManager.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(
                     "INSERT INTO value VALUES (DEFAULT, ?, ?, ?)")) {
            preparedStatement.setInt(1, value.getDocument());
            preparedStatement.setInt(2, value.getField());
            preparedStatement.setString(3, value.getInfo());
            preparedStatement.execute();
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    @Override
    public boolean updateValueById(Integer id) {
        return false;
    }
}
