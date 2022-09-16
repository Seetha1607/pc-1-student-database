/*
 *Author Name : Seetha Lakshmi.G.M
 *Date : 16-09-2022
 *Created With : IntelliJ IDEA Community Edition
 */


package com.jap.service.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseService {

    // A constant variable.
    private static final String URL = "jdbc:mysql://localhost:3306/school";
    // A constant variable.
    private static final String USERNAME = "root";
    // A constant variable.
    private static final String PASSWORD = "admin";

    // A private field to store the references of the connection object
    private Connection databaseConnection;

    /**
     * This function returns the database connection.
     *
     * @return The databaseConnection object.
     */
    public Connection getDatabaseConnection() {
        return databaseConnection;
    }

    public DatabaseService() {
        this.databaseConnection = null;
    }

    /**
     * This function returns false.
     */
    public boolean connect() throws SQLException {
        // 1. load the jdbc driver into memory
        //Class.forName("com.mysql.cj.jdbc.Driver");
        // 2. create a connection object using the DriverManager class
        databaseConnection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        return databaseConnection != null;
    }

    /**
     * This function prints the connection status of the device.
     */
    public void printConnectionStatus() {
        if (databaseConnection != null) {
            System.out.println("\u001B[32m Database is connected. \u001B[0m");
        } else {
            System.err.println("!!Database is NOT connected!!");
        }
    }
}
