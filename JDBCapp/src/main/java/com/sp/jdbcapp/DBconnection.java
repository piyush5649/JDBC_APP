package com.sp.jdbcapp;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBconnection {
    
    private static final String URL = "jdbc:mysql://localhost:3306/testdb";
    private static final String USER = "root";
    private static final String PASSWORD = "sp@5649";

    public static Connection getconnection() {
        try {
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
