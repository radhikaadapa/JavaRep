package com.test.examples;

public class forloopDemo {

	public static void main(String[] args) {
		 for(int i=10; i>0; --i){
             System.out.println("The value of i is: "+i);
        }
		 int arr[]={2,11,45,9};
         //i starts with 0 as array index starts with 0 too
         for(int i=0; i<arr.length; ++i){
              System.out.println(arr[i]);
         }
         {
             int arr1[]={2,11,45,9};
             for (int num : arr1) {
                System.out.println(num);}
         String arr2[]={"hi","hello","bye"};
         for (String str : arr2) {
         
       System.out.println(str);
         }
         
	}
}
}