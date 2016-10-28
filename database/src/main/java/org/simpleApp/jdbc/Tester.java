package org.simpleApp.jdbc;

import org.simpleApp.jdbc.entity.Students;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Dmitriy on 29.10.2016.
 */
public class Tester {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        List<Students> list = new ArrayList<Students>();
        Class.forName("org.postgresql.Driver");
        Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432//postgres", "postgres", "89061361420");
        Statement statement = connection.createStatement();
        ResultSet result = statement.executeQuery("select * from student_group ");
        while (result.next()) { 
            Students students = new Students();
            students.setFirstName(result.getString("first_name"));
            students.setLastName(result.getString("last_name"));
            students.setGroupId(result.getInt("id"));
            list.add(students);
        }

        for (Students student : list) {
            System.out.println(student);
        }
    }
}
