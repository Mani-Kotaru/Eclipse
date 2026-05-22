package com.javaintro;

public class Product {
   String storeName="VSM",prodName;
	  int prodId,prodPrice;
	  void details()
	  {
		  System.out.println(storeName);
		  System.out.println(prodId);
		  System.out.println(prodName);
		  System.out.println(prodPrice);
		  
	  }
	  public static void main(String[] args) {
	       Product p1=new Product();
		  Product p2=new Product();
		  Product p3=new Product();
		  p1.prodId=10;
		  p1.prodName="Chocolate";
		  p1.prodPrice=20;
		  p2.prodId=11;
		  p2.prodName="Banana";
		  p2.prodPrice=8;
		  p3.prodId=12;
		  p3.prodName="Potato chips";
		  p3.prodPrice=30;
		  p1.details();
		  System.out.println("**************************");
		  p2.details();
		  System.out.println("**************************");
		  p3.details();
		  System.out.println("**************************"); 
		 }
}
