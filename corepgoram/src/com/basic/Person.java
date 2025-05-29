package com.basic;

public class Person 
{
	 String name;
	    int age;

	    Person() {
	        name = "aman";
	        age = 23;
	        System.out.println("Constructor with no parameters called");
	    }

	    Person(String n) {
	        name = n;
	        age = 22;
	        System.out.println("Constructor with 1 parameter called");
	    }

	    Person(String n, int a) {
	        name = n;
	        age = a;
	        System.out.println("Constructor with 2 parameters called");
	    }

	    void display() {
	        System.out.println("Name"+name+",Age"+age);
	    }

	    public static void main(String[] args) {
	      
	        Person p1 = new Person();
	        p1.display();

	       
	        Person p2 = new Person("tushar");
	        p2.display();

	       
	        Person p3 = new Person("Amit", 19);
	        p3.display();
	    }
}
