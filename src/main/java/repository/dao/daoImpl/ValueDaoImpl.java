package repository.dao.daoImpl;

import pojo.Category;
import pojo.Field;
import pojo.Value;
import repository.connectionManager.ConnectionManager;
import repository.connectionManager.ConnectionManagerJdbcImpl;
import repository.dao.ValueDao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

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

    @Override
    public List<Value> getValueById(Integer documentId) {
        List<Value> result = null;
        try (Connection connection = connectionManager.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(
                     "SELECT * FROM value where doc_id = ?")) {
            preparedStatement.setInt(1, documentId);
            try (ResultSet resultSet = preparedStatement.executeQuery();) {
                result = new ArrayList<>();
                while (resultSet.next()) {
                    result.add(new Value(
                            resultSet.getInt(1),
                            resultSet.getInt(2),
                            resultSet.getInt(3),
                            resultSet.getString(4)));
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }


//    @Override
//    public Value getValueByDocIdAndFieldId(Integer documentId, Integer valueId) {
//
//        try (Connection connection = connectionManager.getConnection();
//             PreparedStatement preparedStatement = connection.prepareStatement(
//                     "SELECT * FROM value WHERE doc_id = ? and field_id = ?")) {
//            preparedStatement.setInt(1, documentId);
//            preparedStatement.setInt(2, valueId);
//            try (ResultSet resultSet = preparedStatement.executeQuery();) {
//                if (resultSet.next()) {
//                    return new Value(
//                            resultSet.getInt(1),
//                            resultSet.getInt(2),
//                            resultSet.getInt(3),
//                            resultSet.getString(4));
//                }
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        return null;
//    }
//

}

