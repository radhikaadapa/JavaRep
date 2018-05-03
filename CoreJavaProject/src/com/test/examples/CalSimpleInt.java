package com.test.examples;

public class CalSimpleInt {

	public static void main(String[] args) {
		
	/*	CalculateInt(2000,12,2);
		CalculateInt(3000,12,2);
		CalculateInt(4000,12,2);
		*/
		
double SimpleInt = CalculateSimInt(2000,12,2.5);
//System.out.println("Simple Interest:" + SimpleInt);
//System.out.println("Amount With Interest:" + (SimpleInt + 2000));

highInt(SimpleInt, 2000);

//
}
	
public static void CalculateInt(int amount,int months,int rate) {
	 int Interest = (amount*months*rate)/100;
		System.out.println("Intrest: "+ Interest);
	System.out.println( (amount*months*rate)/100);
	
}
public static double CalculateSimInt(int amount,int months,double rate) {
	double SimInt = (amount*months*rate)/100;
	return SimInt;
}


public static void highInt(double x, int y) {
	
	double c = (x+y) * 25/100;
	
	System.out.println("new cal value: " + c);
}

}
