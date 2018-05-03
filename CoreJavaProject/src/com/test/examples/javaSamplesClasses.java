package com.test.examples;

public class javaSamplesClasses {

	public static void main(String[] args) { 
		// TODO Auto-generated method stub
		System.out.println("My First Class");
		
		int p=1000;
		int n=12;
		int r=2; 
		
		int si=(p*n*r)/100;
		
		System.out.println("Interest " +si);
		
		System.out.println("Int: " + (p*n*r)/100);
		
		
	method1();
	
	int j = method2();
	System.out.println("returned Value: " + j);
	//System.out.println(method2());;
	}
	
	public static void method1() {
		System.out.println("My First Method");
	}

    public static int method2() {
	System.out.println("My 2nd method return integer");
	int k = 10;
    return k;
	}
	

}
