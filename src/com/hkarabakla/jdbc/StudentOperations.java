package com.hkarabakla.jdbc;

import java.sql.*;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.UUID;

public class StudentOperations {

    public static void main(String[] args) {

        Student s1 = new Student(UUID.randomUUID(), "Fuat", LocalDate.of(1980, 1, 1));
        Student s2 = new Student(UUID.randomUUID(), "Onur", LocalDate.of(1990, 1, 1));
        Student s3 = new Student(UUID.randomUUID(), "Huseyin", LocalDate.of(1985, 1, 1));


        try (Connection con = DriverManager.getConnection("jdbc:h2:mem:school", "admin", "admin")) {

            Statement statement = con.createStatement();

            String createTable = "CREATE TABLE IF NOT EXISTS students (" +
                    "studentNo VARCHAR(36) PRIMARY KEY, studentName VARCHAR(30), birthDate VARCHAR(10))";

            statement.executeUpdate(createTable);


            String insertStudent = "INSERT INTO students (studentNo, studentName, birthDate) VALUES (?, ?, ?)";

            PreparedStatement studentStatement = con.prepareStatement(insertStudent);

            Arrays.asList(s1, s2, s3).forEach(s -> {
                try {
                    studentStatement.setString(1, s.getStudentNo().toString());
                    studentStatement.setString(2, s.getName());
                    studentStatement.setString(3, s.getBirthDate().toString());

                    int i = studentStatement.executeUpdate();

                    if (i == 1) {
                        System.out.println(s.getStudentNo() + " saved to database");
                    } else {
                        System.out.println(s.getStudentNo() + " failed while saving to database");
                    }

                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            });


            String selectStudents = "SELECT * FROM students";

            ResultSet resultSet = statement.executeQuery(selectStudents);

            while (resultSet.next()) {
                Student s = new Student(
                        UUID.fromString(resultSet.getString(1)),
                        resultSet.getString(2),
                        LocalDate.parse(resultSet.getString(3))
                );
                System.out.println(s);
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
