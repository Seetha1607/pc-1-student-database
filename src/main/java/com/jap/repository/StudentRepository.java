/*
 *Author Name : Seetha Lakshmi.G.M
 *Date : 16-09-2022
 *Created With : IntelliJ IDEA Community Edition
 */


package com.jap.repository;

import com.jap.model.Student;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class StudentRepository {
    public List<Student> getAllStudentDetails(Connection databaseConnection) throws SQLException {

        // A query to get all the student details from the database.
        String readQuery = "SELECT * FROM school.student;";

        List<Student> studentList = new ArrayList<>();
        //Create statement object
        try (Statement statement = databaseConnection.createStatement()) {
            ResultSet studentsList = statement.executeQuery(readQuery);
            while (studentsList.next()) {
                int rollNumber = studentsList.getInt("roll_number");
                String name = studentsList.getString("name");
                int grades = studentsList.getInt("grades");

                Student student = new Student(rollNumber, name, grades);

                studentList.add(student);
            }
        }
        return studentList;
    }
}
