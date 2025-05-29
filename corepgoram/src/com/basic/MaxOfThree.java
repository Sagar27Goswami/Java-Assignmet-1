
package com.basic;

public class MaxOfThree 
{
	
	    public static int findMax(int a, int b, int c) 
	    {
	        int max;

	        if (a>=b&&a>=c) {
	            max=a;
	        } else if (b>=a&&b>=c) {
	            max = b;
	        } else {
	            max = c;
	        }

	        return max;
	    }

	    
	    public static void main(String[] args) 
	    {
	        int num1 = 10;
	        int num2 = 25;
	        int num3 = 15;

	        int max = findMax(num1, num2, num3);

	        System.out.println("The maximum number is:"+max);
	    }
	}


