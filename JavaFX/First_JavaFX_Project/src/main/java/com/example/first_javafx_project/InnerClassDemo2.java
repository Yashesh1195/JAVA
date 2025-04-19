package com.example.first_javafx_project;

class Student {
    public void displayName(String name) {
        System.out.println("Hello, " + name + "!!");
    }
    public void welcomeStudent(String name) {

    }
}

public class InnerClassDemo2 {

    static Student s = new Student() {
        public void displayName(String name) {
            System.out.println("Name of the student is: " + name);
        }

        public void welcomeStudent(String name) {
            System.out.println("Welcome to the University: " + name);
        }
    };

    public static void main(String[] args) {
//        Student s = new Student();
//        s.displayName("Yashesh");
        s.displayName("Yashesh");
        s.welcomeStudent("Yashesh");
    }
}
