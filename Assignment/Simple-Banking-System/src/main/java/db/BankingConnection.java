package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class BankingConnection
{
    private final Connection connection;

    public BankingConnection() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");

        connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/simple_banking_system",
                "root",
                "password"
        );
        connection.setAutoCommit(false);

        System.out.println("---- Connected to MySQL Successfully ----");
    }

    public Connection getConnection() {
        return connection;
    }

}
