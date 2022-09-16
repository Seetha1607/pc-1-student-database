/*
 *Author Name : Seetha Lakshmi.G.M
 *Date : 16-09-2022
 *Created With : IntelliJ IDEA Community Edition
 */


package com.jap.service.database;

import java.sql.Connection;

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
     * This function returns false.
     */
    public boolean connect() {
        return false;
    }

    public void printConnectionStatus() {
    }
}
