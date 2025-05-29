package com.basic;



class Device {
    void display() {
        System.out.println("This is a device");
    }
}

class Laptop extends Device {
    void show() {
        System.out.println("This is a laptop");
    }
}
public class InheritanceExample 
{
	public static void main(String[] args) {
        Laptop myLaptop = new Laptop();
        myLaptop.display();  
        myLaptop.show();     
    }
}
