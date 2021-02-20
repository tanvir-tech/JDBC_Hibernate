package DAO;

import java.sql.*;

public class Student_DAO {
    // get all // Search // insert // delete // update
    Student s;
    MySQL_connector mySQL_connector = new MySQL_connector();
    Connection connection;
    PreparedStatement statement;
    ResultSet resultSet;

    public Student getStudentBy_ID(int id){
        try {
            connection = mySQL_connector.getConnection();
            statement = connection.prepareStatement("SELECT * FROM student WHERE id=?");
            statement.setInt(1,id);
            resultSet = statement.executeQuery();
            System.out.println("Query Fired");

            while (resultSet.next()){                                       // Get Multiple Rows
                String name = resultSet.getString(2);                    // using Column Number
                int age = resultSet.getInt(3);
                String place = resultSet.getString(4);
                s = new Student(id,age,name,place);
            }
        } catch (ClassNotFoundException e) {
            System.out.println("Connection Problem!");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Connection Problem!");
            e.printStackTrace();
        }
        finally {
            mySQL_connector.closeConnection();
            return s;
        }
    }
}
