package com.lesson3;

/*
Calculate your salary :Every month you are receiving Gross Salary and Allowance(from government).
Every resident should pay a taxes, which is a bad news, good news we are not paying tax for Allowance !
You have 2 taxes rates 45% and 24% which should calculate tax from Texable amount.
Please calculate your Net Salary,
Your outprint should look like this one:Please enter your name : AMHi AM can you please enter your salary : 3032Thank you AM can you now enter the tax rate ie .45 or .24 :.45Finally AM please enter your tax free allowance : 200	Here's the bad news AM
	Gross Salary = 	3032.0
	Allowance = 	200.0
			________
	Taxable = 	2832.0
	Rate = 		45.0%
	Tax due = 	1274.4
	Net Salary = 	1757.6*/// declare a class


import java.util.*;

public class Wage {
    // declare instance variables
    private String name;        
    private double salary;
    private double rate;
    private double netSalary;
    private double allowance;
    private double taxDue;
    private double taxable;        
    
    public static void main(String args[]){
        // declare and create objects
        Scanner sc = new Scanner(System.in);
        Wage myTax = new Wage();
        // get input from user
        System.out.print("Please enter your name: ");
        myTax.name = sc.next();
	     
		
		 System.out.print("\nHi "+myTax.name+" can you please enter your salary : ");
	        myTax.salary = sc.nextDouble();                
	        System.out.print("\nThank you " +myTax.name+ " can you now enter the tax rate ie .45 or .24 :");
	        myTax.rate = sc.nextDouble();               
	        System.out.print("\nFinally " + myTax.name + " please enter your tax free allowance : ");
	        myTax.allowance = sc.nextDouble();                
	        //process
	        myTax.taxable = myTax.calcTaxable(myTax.salary, myTax.allowance);
	        myTax.taxDue = myTax.calcTaxDue(myTax.taxable, myTax.rate);
	        myTax.netSalary = myTax.calcNetSal(myTax.salary, myTax.taxDue);         
	        //output the bad news to the poor user
	        System.out.println("\n\tHere's the bad news " + myTax.name + "\n"+
	                "\tGross Salary = \t" + myTax.salary + "\n" +
	                "\tAllowance = \t" + myTax.allowance + "\n" +
	                "\t\t\t________\n"+
	                "\tTaxable = \t" + myTax.taxable + "\n" +
	                "\tRate = \t\t" + (myTax.rate*100) + "%\n" +
	                "\tTax due = \t" + myTax.taxDue + "\n" +
	                "\tNet Salary = \t" + myTax.netSalary + "\n");
	    }
	    // method to calculate amount taxable
	    public double calcTaxable(double sal, double all){
	        return sal - all;
	    }    public double calcTaxDue(double txble, double rt){
	        return txble * rt;
	    }    public double calcNetSal(double sal,double txDue){
	        return sal - txDue;
	    }
	


}