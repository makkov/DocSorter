package repository.dao.daoImpl;

import pojo.Category;
import repository.connectionManager.ConnectionManager;
import repository.connectionManager.ConnectionManagerJdbcImpl;
import repository.dao.CategoryDao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CategoryDaoImpl implements CategoryDao {

    private static ConnectionManager connectionManager = ConnectionManagerJdbcImpl.getInstance();

    @Override
    public boolean addCategory(Category category) {
        try (Connection connection = connectionManager.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(
                     "INSERT INTO category VALUES (DEFAULT, ?, ?)")) {
            preparedStatement.setString(1, category.getName());
            preparedStatement.execute();
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    @Override
    public boolean deleteCategoryById(Integer id) {
        try (Connection connection = connectionManager.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(
                     "DELETE FROM category WHERE id=?")) {
            preparedStatement.setInt(1, id);
            preparedStatement.execute();
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    @Override
    public Category getCategoryById(Integer id) {
        try (Connection connection = connectionManager.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(
                     "SELECT * FROM category WHERE id = ?")) {
            preparedStatement.setInt(1, id);
            try (ResultSet resultSet = preparedStatement.executeQuery();) {
                if (resultSet.next()) {
                    return new Category(
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
    public List<Category> getAllCategoriesWithId() {
        List<Category> result = null;
        try (Connection connection = connectionManager.getConnection();
             Statement statement = connection.createStatement()) {
            try (ResultSet resultSet = statement.executeQuery("SELECT * FROM category");) {
                result = new ArrayList<>();
                while (resultSet.next()) {
                    result.add(new Category(
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

    @Override
    public boolean updateCategoryById(Category category) {
        try (Connection connection = connectionManager.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(
                     "UPDATE category SET name=?" +
                             "WHERE id=?");) {
            preparedStatement.setString(1, category.getName());
            preparedStatement.setInt(2, category.getId());
            preparedStatement.execute();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
}
