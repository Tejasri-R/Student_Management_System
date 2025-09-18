package com.tasks;

import java.util.ArrayList;
import java.util.Scanner;

public class Student {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Student_Management> students = new ArrayList<>();

        int choice;

        do {
            System.out.println("===== Student Management System =====");
            System.out.println("1. Add Student");
            System.out.println("2. Remove Student");
            System.out.println("3. Display Students");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = scan.nextInt();
            scan.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    addStudent(students, scan);
                    break;
                case 2:
                    removeStudent(students, scan);
                    break;
                case 3:
                    displayStudents(students);
                    break;
                case 0:
                    System.out.println(" Exiting... Goodbye!");
                    break;
                default:
                    System.out.println(" Invalid choice, try again.\n");
            }

        } while (choice != 0);

        scan.close();
    }

    // Method to add a student
    private static void addStudent(ArrayList<Student_Management> students, Scanner scan) {
        System.out.print("Enter Student ID: ");
        int id = scan.nextInt();
        scan.nextLine(); // consume newline

        System.out.print("Enter Student Name: ");
        String name = scan.nextLine();

        System.out.print("Enter Student Grade: ");
        char grade = scan.next().charAt(0);

        students.add(new Student_Management(id, name, grade));
        System.out.println(" Student added successfully!\n");
    }

    // Method to remove a student by ID
    private static void removeStudent(ArrayList<Student_Management> students, Scanner scan) {
        System.out.print("Enter Student ID to remove: ");
        int id = scan.nextInt();
        scan.nextLine(); // consume newline

        boolean removed = false;
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getId() == id) {
                students.remove(i);
                System.out.println(" Student removed successfully!\n");
                removed = true;
                break;
            }
        }

        if (!removed) {
            System.out.println("Student not found!\n");
        }
    }

    // Method to display all students
    private static void displayStudents(ArrayList<Student_Management> students) {
        if (students.isEmpty()) {
            System.out.println(" No students available.\n");
        } else {
            System.out.println(" Student List:");
            for (Student_Management s : students) {
                System.out.println(s);
            }
            System.out.println();
        }
    }
}
