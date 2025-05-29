package com.basic;
import java.util.Scanner;

public class Arithmatic 
{
	public static void main(String[] args) 
	{
	        Scanner input = new Scanner(System.in);

	        
	        System.out.print("Enter first number:");
	        int a = input.nextInt();

	        System.out.print("Enter second number:");
	        int b = input.nextInt();



	        System.out.println("Addition:"+(a+b));
	        
	        
	        System.out.println("Subtraction:"+(a-b));
	        
	        System.out.println("Multiplication:"+(a*b));
	       
	        System.out.println("Division:"+(a/b));  

	        
	        System.out.println("a equal to b"+(a==b));
	        
	        System.out.println("a not equal to b"+(a!=b));
	        
	        System.out.println("a greater than b"+(a>b));
	        
	        System.out.println("a less than b"+(a<b));

	        
	    }
	}
