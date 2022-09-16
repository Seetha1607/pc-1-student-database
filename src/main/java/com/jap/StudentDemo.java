package com.jap;

import com.jap.service.database.DatabaseService;

import java.sql.SQLException;

public class StudentDemo {

    public static void main(String[] args) throws RuntimeException {
        DatabaseService databaseService = new DatabaseService();
        try {
            databaseService.connect();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        databaseService.printConnectionStatus();
    }

    public void getAllStudentDetails() {
        //Load the Drivers
        // Get the connection from database

        //Create statement object

        //execute the query

        //display the ResultSet Data
    }
}
