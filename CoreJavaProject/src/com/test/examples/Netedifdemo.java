package com.test.examples;

public class Netedifdemo {
    public static void main(String[] args) {

       int num = 100;
      	if (num < 150)	{
      		System.out.println("Number is less than 150");
    		}
    if (num>50) {
    	System.out.println("Number is greater than 50");
    }
    if (num <150 && num>=100) {
    	System.out.println("Number less than 150 and equals to 100");
    }
    if (num<=100) {
    	System.out.println("Number not less than 100 but equals to 100");
    }
    if (num>=80) {
    	System.out.println("Number greater than 100 not equal to 80");
    }
    if (num>=80 && num <=99) {
    	System.out.println("Number equals to 100");
    }
    if (num>=100|| num<=99) {
    	System.out.println("or operator is working");
    }   
    if (num ==100 ) {
    	System.out.println("Number equals to 100 using relational operator");
    }
}
    }


