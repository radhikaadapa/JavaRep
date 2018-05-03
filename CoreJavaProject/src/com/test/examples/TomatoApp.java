package com.test.examples;

public class TomatoApp {

	public static void main(String[] args) {
		
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int c = Integer.parseInt(args[2]);
		
		
		qntyredtomoto(a,b);
		
		int yellowquantity = qntyyellow (a,c);
		System.out.println("Yellowtomoto quantity is:" + yellowquantity);
		int calp = calprice(a,b);
		System.out.println("Price per kg:" + calp);
	}
public static void qntyredtomoto(int totalwgt, int onetmtowghingrms) {
	//
	int ttlquantity = (totalwgt*1000)/onetmtowghingrms;
	System.out.println("redtomotoes quantity is:" + ttlquantity);
}
public static int qntyyellow(int totalwgt, int onetmtowghingrms) {
	int ttlyquantity = (totalwgt*1000)/onetmtowghingrms;
	return ttlyquantity;
}
public static int calprice(int pricekg, int totalwgt) {
	int calp = totalwgt* pricekg;
	return calp;
}
}

