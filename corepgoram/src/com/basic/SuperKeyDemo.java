package com.basic;

class Person1 {
    String name;

    Person1(String n) {
        name = n;
        System.out.println("Person constructor called");
    }

    void display() {
        System.out.println("Name: " + name);
    }
}

class Employee1 extends Person1 {
    int empId;

    Employee1(String n, int id) {
        super(n);  
        empId = id;
        System.out.println("Employee constructor called");
    }

    @Override
    void display() {
        super.display(); 
        System.out.println("Employee ID: " + empId);
    }
}

public class SuperKeyDemo {
    public static void main(String[] args) {
        Employee1 emp = new Employee1("Aman", 101);
        emp.display();
    }
}
