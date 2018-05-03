package com.test.examples;

public class Quantitycal {

	public static void main(String[] args) {
		
		qntyredtomoto(5,5);
		int yellowquantity = qntyyellow (5,10);
		System.out.println("Yellowtomoto quantity is:" + yellowquantity);
		int calp = calprice(5,5);
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

