package com.hkarabakla.jdbc;

import java.time.LocalDate;
import java.util.UUID;

public class Student {

    private UUID studentNo;
    private String name;
    private LocalDate birthDate;

    public Student(UUID studentNo, String name, LocalDate birthDate) {
        this.studentNo = studentNo;
        this.name = name;
        this.birthDate = birthDate;
    }

    public UUID getStudentNo() {
        return studentNo;
    }

    public void setStudentNo(UUID studentNo) {
        this.studentNo = studentNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentNo=" + studentNo +
                ", name='" + name + '\'' +
                ", birthDate=" + birthDate +
                '}';
    }
}
