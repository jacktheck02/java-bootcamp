package com.academy.student;

import java.util.Scanner;

public class StudentManager {

    private static final int MAX_STUDENTS = 20;

    private final Student[] students = new Student[MAX_STUDENTS];
    private int studentCount = 0;
    private final Scanner scanner;

    public StudentManager(Scanner scanner) {
        this.scanner = scanner;
    }

    public void displayMenu() {
        System.out.println("====================================");
        System.out.println("Student Management System");
        System.out.println("====================================");
        System.out.println("1. Add Student");
        System.out.println("2. Display Students");
        System.out.println("3. Search Student");
        System.out.println("4. Average Marks");
        System.out.println("5. Exit");
        System.out.print("Enter Choice : ");
    }

    private boolean readStudentId(int[] studentIdHolder) {
        try {
            studentIdHolder[0] = Integer.parseInt(scanner.nextLine());
            return true;
        } catch (NumberFormatException e) {
            System.out.println("Invalid ID");
            return false;
        }
    }

    private boolean readStudentMarks(double[] marksHolder) {
        try {
            marksHolder[0] = Double.parseDouble(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Invalid Marks");
            return false;
        }
        if (marksHolder[0] < 0 || marksHolder[0] > 100) {
            System.out.println("Outside marks boudary");
            return false;
        }

        return true;
    }

    private boolean hasStudents() {
        if (studentCount == 0) {
            System.out.println("No students to display");
            return false;
        }

        return true;
    }

    public void addStudent() {
        if (studentCount >= MAX_STUDENTS) {
            System.out.println("full");
            return;
        }

        System.out.print("Student ID: ");
        int[] studentIdHolder = new int[1];
        if (!readStudentId(studentIdHolder))
            return;

        int studentId = studentIdHolder[0];
        for (int i = 0; i < studentCount; i++) {
            if (students[i].getStudentId() == studentId) {
                System.out.println("rejected");
                return;
            }
        }

        System.out.print("Name: ");
        String name = scanner.nextLine();
        if (name.isEmpty()) {
            System.out.println("Name empty");
            return;
        }

        System.out.print("Course: ");
        String course = scanner.nextLine();
        if (course.isEmpty()) {
            System.out.println("Course empty");
            return;
        }

        System.out.println("Marks: ");
        double[] marksHolder = new double[1];
        if (!readStudentMarks(marksHolder))
            return;

        double marks = marksHolder[0];

        Student newStudent = new Student(studentId, name, course, marks);

        students[studentCount] = newStudent;
        studentCount++;
        System.out.println("Student Added Successfully.");
    }

    public void displayStudents() {
        if (!hasStudents())
            return;

        for (int i = 0; i < studentCount; i++) {
            System.out.println("----------------------------------------------------------");
            System.out.printf("%-8d %-20s %-15s %-8.2f%n",
                    students[i].getStudentId(),
                    students[i].getName(),
                    students[i].getCourse(),
                    students[i].getMarks());
            System.out.println("----------------------------------------------------------");
        }
    }

    public void searchStudent() {
        if (!hasStudents())
            return;

        System.out.print("Student ID: ");
        int[] studentIdHolder = new int[1];
        if (!readStudentId(studentIdHolder))
            return;

        int studentId = studentIdHolder[0];
        for (int i = 0; i < studentCount; i++) {
            if (students[i].getStudentId() == studentId) {
                students[i].display();
                return;
            }
        }

        System.out.println("Student not found");
    }

    public void calculateAverage() {
        if (!hasStudents())
            return;

        double average = 0;

        for (int i = 0; i < studentCount; i++)
            average += students[i].getMarks() / studentCount;

        System.out.printf("Average Marks: %.2f", average);
    }

}
