package com.example.school;

public class Student {
    private String studentName;
    private int studentAge;
    private int studentGrade;
    private int studentIMG;


    public Student(String studentName, int studentAge, int studentGrade, int studentIMG) {
        this.studentName = studentName;
        this.studentAge = studentAge;
        this.studentGrade = studentGrade;
        this.studentIMG = studentIMG;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getStudentAge() {
        return studentAge;
    }

    public void setStudentAge(int studentAge) {
        this.studentAge = studentAge;
    }

    public int getStudentGrade() {
        return studentGrade;
    }

    public void setStudentGrade(int studentGrade) {
        this.studentGrade = studentGrade;
    }

    public int getStudentIMG() {
        return studentIMG;
    }

    public void setStudentIMG(int studentIMG) {
        this.studentIMG = studentIMG;
    }
}
