package com.basic;
class One {
    String name;

    One(String n) {
        name = n;
        System.out.println("Person constructor called");
    }

    void display() {
        System.out.println("Name: " + name);
    }
}

class Employee extends One {
    int empId;

    Employee(String n, int id) {
        super(n);  
        empId = id;
        System.out.println("Employee constructor called");
    }

    
    void display() {
        super.display();  
        System.out.println("Employee ID: " + empId);
    }
}
public class SuperKey 
{
	public static void main(String[] args) 
	{
        Employee emp = new Employee("Aman", 101);
        emp.display();
    }
}
