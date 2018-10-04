package repository.connectionManager;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionManagerJdbcImpl implements ConnectionManager {

    private static ConnectionManager connectionManager;

    private ConnectionManagerJdbcImpl() {
    }

    public static ConnectionManager getInstance() {
        if (connectionManager == null) {
            connectionManager = new ConnectionManagerJdbcImpl();
        }
        return connectionManager;
    }

    @Override
    public Connection getConnection() {
        Connection connection = null;
//        String url = "jdbc:postgresql://localhost:5433/DocSorter";
//        String user = "postgres";
//        String password = "122544";
        try {
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection(
                    "jdbc:postgresql://localhost:5433/DocSorter",
                    "postgres",
                    "122544");

//            url, user, password);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }
}
