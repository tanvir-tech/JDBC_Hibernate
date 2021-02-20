package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class MySQL_connector {
    Connection connection;
    public Connection getConnection() throws ClassNotFoundException, SQLException {
        String urlPreset = "jdbc:mysql://localhost:3306/";
        String dataBaseName = "jdbctest";
        String url = urlPreset + dataBaseName;
        String userName = "root";
        String passWord = "";
        //create a connection method to do all these staff
        Class.forName("com.mysql.jdbc.Driver");
        connection = DriverManager.getConnection(url,userName,passWord);
        System.out.println("Database connected");
        return connection;
    }
    public boolean closeConnection(){
        try {
            connection.close();
            System.out.println("Database disconnected");
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
}
