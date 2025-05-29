package com.basic;

class Vehicle {
    void display() {
        System.out.println("This is a vehicle");
    }
}

class Car extends Vehicle {
    void show() {
        System.out.println("This is a car");
    }
}

public class Inheritance 
{
	public static void main(String[] args) {
        Car myCar = new Car();
        myCar.display();  
        myCar.show();     
    }
}
