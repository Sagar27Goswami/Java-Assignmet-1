package com.basic;

public class Student4 
{
	String name;
    int age;

    
    Student4() {
        name = "Unknown";
        age = 0;
        System.out.println("Default Constructor called");
    }

   
    Student4(String n, int a) {
        name = n;
        age = a;
        System.out.println("Parameterized Constructor called");
    }

    
    Student4(Student s) {
        name = s.name;
        age = s.age;
        System.out.println("Copy Constructor called");
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        System.out.println(" Default Constructor");
        Student4 s1 = new Student4();
        s1.display();

        System.out.println("Parameterized Constructor");
        Student4 s2 = new Student4("Aman", 20);
        s2.display();

        System.out.println("Using Copy Constructor");
        Student4 s3 = new Student4(s2);
        s3.display();
    }
}
