package com.test.examples;

public class CalcompoundInt {
	public static void main(String[] args) {
	int SimpleInt =	simpleint(20000,1,2);
		System.out.println("Simple interest for 12 months with rate of 2:" + SimpleInt);
		int TotalwInt = SimpleInt + 20000;
		System.out.println("Total amount with int:" + TotalwInt);
		int cominterest = ComInt(TotalwInt,1,2);
		System.out.println("Total int:" + cominterest);
		System.out.println("Total Amount: " + (TotalwInt+cominterest));
}
	public static int simpleint(int amount, int years, int rate) {
		int Simint = (amount*years*rate)/100;
		return Simint;
}
	public static int ComInt(int TotalwInt, int years, int rate) {
		int cominterest = (TotalwInt*years*rate)/100;
		return cominterest;
		
	}
}