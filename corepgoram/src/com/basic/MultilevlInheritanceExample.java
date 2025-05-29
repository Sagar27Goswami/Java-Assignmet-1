package com.basic;

class Animal 
{
    void eat() 
    {
        System.out.println("Animal eats food");
    }
}

class Mammal extends Animal 
{
    void walk() 
    {
        System.out.println("Mammal walks on land");
    }
}

class Dog extends Mammal 
{
    void bark() 
    {
        System.out.println("Dog bark");
    }
}


public class MultilevlInheritanceExample 
{
	public static void main(String[] args) 
	{
        Dog d = new Dog();
        d.eat();
        d.walk();
        d.bark();
    }
}
