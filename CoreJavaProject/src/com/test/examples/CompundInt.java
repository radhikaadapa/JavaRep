package com.test.examples;

import static java.lang.Math.pow;

public class CompundInt
{
	public static void main(String args[])
	{
 
	     double amount,principle,rate,time,ci,sum;
                
             principle=Double.parseDouble(args[0]);
                 
             rate=Double.parseDouble(args[1]);
                  
             time=Double.parseDouble(args[2]);	
			
	     rate=(1+rate/100);
	
	     rate=pow(rate,time);
 
	     amount=principle*rate;
 
	   //  System.out.println("amount="+amount);
 
	     ci=amount-principle;
 
	     System.out.println("compound interest="+ci);
	     System.out.println("Total amount="+amount);
 
	}
}