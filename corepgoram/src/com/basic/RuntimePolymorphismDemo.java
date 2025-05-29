package com.basic;


class An {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class dd extends An {
    
    void sound() {
        System.out.println("Dog barks");
    }
}
public class RuntimePolymorphismDemo 
{
	public static void main(String[] args) {
        An a = new DD(); 
        a.sound();          
    }
}
