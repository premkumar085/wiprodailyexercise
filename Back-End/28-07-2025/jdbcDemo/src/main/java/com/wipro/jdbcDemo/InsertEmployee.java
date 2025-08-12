package com.wipro.jdbcDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertEmployee {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/MySQL8";
        String user = "root";
        String password = "Premnani@085";

        String insertQuery = "INSERT INTO employee (emp_name, department) VALUES (?, ?)";

        try {
            Connection conn = DriverManager.getConnection(url, user, password);
            PreparedStatement stmt = conn.prepareStatement(insertQuery);

            stmt.setString(1, "John Doe");
            stmt.setString(2, "IT");

            int rowsInserted = stmt.executeUpdate();

            if (rowsInserted > 0) {
                System.out.println("Employee inserted successfully.");
            }

            stmt.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

