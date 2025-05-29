package com.basic;



//overloading 
public class Student1 
{
	 String name;
	    int age;

	  
	    Student1() {
	        name = "Aman";
	        age = 19;
	    }

	   
	    Student1(String n, int a) {
	        name = n;
	        age = a;
	    }

	   
	    void displayDetails() {
	        System.out.println("Name:"+name);
	        System.out.println("Age:"+age);
	    }

	  
	    public static void main(String[] args) {
	       
	        Student1 s1 = new Student1();

	       
	        Student1 s2 = new Student1("sagar",20);

	        
	        System.out.println("Student 1:");
	        s1.displayDetails();

	        System.out.println("Student 2:");
	        s2.displayDetails();
	    }
	
}
