package com.myhotel.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class GetConnection {

    public static Connection getConnection() {

        Connection con = null;
        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Drfiver loaded");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/myhotel", "root", "root");
            System.out.println("connection success");
        } catch (ClassNotFoundException | SQLException e) {
            return null;
        }

        return con;
    }

}
