package com.basic;

public class Student5 
{
	

	
	    String name;
	    int age;

	    Student5() {
	        name = "Unknown";
	        age = 0;
	        System.out.println("Default Constructor called");
	    }

	    Student5(String n, int a) {
	        name = n;
	        age = a;
	        System.out.println("Parameterized Constructor called");
	    }

	    Student5(Student5 s) {
	        name = s.name;
	        age = s.age;
	        System.out.println("Copy Constructor called");
	    }

	    void display() {
	        System.out.println("Name: " + name + ", Age: " + age);
	    }

	    public static void main(String[] args) {
	        System.out.println("Default Constructor");
	        Student5 s1 = new Student5();
	        s1.display();

	        System.out.println("Parameterized Constructor");
	        Student5 s2 = new Student5("Aman", 20);
	        s2.display();

	        System.out.println("Using Copy Constructor");
	        Student5 s3 = new Student5(s2);
	        s3.display();
	    }
	}


