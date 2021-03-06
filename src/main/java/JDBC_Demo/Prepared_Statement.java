package JDBC_Demo;

import java.sql.*;

public class Prepared_Statement {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        String urlPreset = "jdbc:mysql://localhost:3306/";
        String dataBaseName = "jdbctest";
        String url = urlPreset + dataBaseName;

        String userName = "root";
        String passWord = "";

        String Query = "SELECT * FROM student WHERE name=?";

        //create a connection method to do all these staff
        Class.forName("com.mysql.jdbc.Driver");
        Connection connection = DriverManager.getConnection(url,userName,passWord);
        PreparedStatement statement = connection.prepareStatement(Query);
        statement.setString(1,"newName");
        ResultSet resultSet = statement.executeQuery();

        while (resultSet.next()){                                       // Get Multiple Rows
            int id = resultSet.getInt(1);                            // using Column Number
            String name = resultSet.getString(2);
            int age = resultSet.getInt(3);
            String place = resultSet.getString(4);

            System.out.println("ID :"+id+"\\Name :"+name+"\\AGE :"+age+"\\Place :"+place+"\n");
        }


        statement.close();
        connection.close();

    }
}
