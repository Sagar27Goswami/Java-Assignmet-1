package com.basic;
//Encapulation code


public class BankAccount 
{
private double balance;


public void setBalance(double b) 
{
    balance = b;
}


public double getBalance() 
{
    return balance;
}


public static void main(String[] args) 
{
    BankAccount acc = new BankAccount();

   
    acc.setBalance(1000.0);

    
    System.out.println("Your account balance is:"+acc.getBalance());
  }

}
