package com.basic;

public class Student3 
{

	int id;
    String name;
    static String college="ABC College";

    public Student3(int id,String name)
    {
        this.id=id;
        this.name=name;
    }

    static void changeCollege(String newCollege)
    {
    	
        college=newCollege;
    }

    void display(){
        System.out.println(id+" "+name+" "+college);
    }

    public static void main(String[] args)
    {
        Student3.changeCollege("XYZ University");

        Student3 s1=new Student3(101,"Alice");
        Student3 s2=new Student3(102,"Bob");

        s1.display();
        s2.display();
    }
}
