package com.task.knowledge.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    public static Connection getConnection() {
        // String host = "pupchik.mysql.ukraine.com.ua";
        String host = "jdbc:mysql://localhost:3306/kpac_db";
        int port = 8080;
        String nameDB = "kpac_db";
        String user = "kpac";
        String pwd = "3N~2b-eNj6";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("MySQL JDBC Driver is not found");
            e.printStackTrace();
            // exit (-1);
        }
        //jdbc:postgresql: //[HOST_NAME]:[PORT_NUMBER] /[DATABASE_NAME]
        String url = String.format("jdbc:mysql://%s/%s", host, nameDB);
        // System.out.println(url);
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(url, user, pwd);
        } catch (SQLException e) {
            System.out.println("Connection Failed : " + e.getMessage());
            //   exit (-1);
        }
        if (connection != null) {
            System.out.println("Database is connected.");
        } else {
            System.out.println("Failed to make connection!");
        }
        return connection;
    }
}
