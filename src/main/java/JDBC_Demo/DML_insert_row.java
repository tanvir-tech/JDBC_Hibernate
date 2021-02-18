package JDBC_Demo;

import java.sql.*;

public class DML_insert_row {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        String urlPreset = "jdbc:mysql://localhost:3306/";
        String dataBaseName = "jdbctest";
        String url = urlPreset + dataBaseName;
        String userName = "root";
        String passWord = "";

        //create a connection method to do all these staff
        Class.forName("com.mysql.jdbc.Driver");
        Connection connection = DriverManager.getConnection(url,userName,passWord);
        Statement statement = connection.createStatement();

        int id = 5 + (int)(Math.random() * 10000); //Random ID
        String name = "newName";
        int age = 30;
        String place = "BD";
        // Update Query
        String Query = "INSERT INTO student VALUES ("+id+",'"+name+"',"+age+",'"+place+"')";            // hard to edit
        int rowAffected_count = statement.executeUpdate(Query);

        System.out.println(rowAffected_count + " Row changed");
        statement.close();
        connection.close();

    }
}
