package com.jap;

import com.jap.repository.StudentRepository;
import com.jap.service.database.DatabaseService;

import java.sql.Connection;
import java.sql.SQLException;

public class StudentDemo {

    public static void main(String[] args) throws RuntimeException, SQLException {
        DatabaseService databaseService = new DatabaseService();
        try {
            databaseService.connect();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        databaseService.printConnectionStatus();

        Connection databaseConnection = databaseService.getDatabaseConnection();
        StudentRepository studentRepository = new StudentRepository();
        studentRepository.getAllStudentDetails(databaseConnection).forEach(System.out::println);
    }
}
