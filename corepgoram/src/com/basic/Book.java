package com.basic;

public class Book 
{
	
	    String title;

	    Book(String t) {
	        title = t;
	        System.out.println(title+"object is created");
	    }

	    protected void finalize() {
	        System.out.println(title+"garbage collected");
	    }

	    public static void main(String[] args) {
	        Book b1 = new Book("Java");
	        Book b2 = new Book("Python");

	        b1 = null;
	        b2 = null;

	        System.gc();

	       
	    }
	}
	

