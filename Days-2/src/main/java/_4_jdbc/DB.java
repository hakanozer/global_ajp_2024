package _4_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class DB {

    private final String driver = "org.h2.Driver";
    private final String url = "jdbc:h2:file:~/global_ajp";
    private final String user = "sa";
    private final String password = "sa";

    private Connection connection;

    public Connection getConnection() {
        try {
            if (connection == null) {
                Class.forName(driver);
                connection = DriverManager.getConnection(url, user, password);
                System.out.println("Connection Success.");
            }
        }catch (Exception ex) {
            System.err.println("Connection Error: " + ex.getMessage());
        }
        return connection;
    }

    public void close() {
        try {
            if (connection != null && !connection.isClosed()) {
                connection.close();
                System.out.println("Connection Closed.");
            }
        }catch (Exception ex) {
            System.err.println("Close Error: " + ex.getMessage());
        }
    }


}
