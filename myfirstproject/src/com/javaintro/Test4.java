package com.javaintro;



public class Test4 {

	public static void main(String[] args) throws ClassNotFoundException {
		System.out.println("Loading classes manually");
		Class c=Class.forName("com.javaintro.Test");
		System.out.println(c);
		Class c1=Class.forName("java.util.Scanner");
	  System.out.println(c1);
	 // Class c3=Class.forName("JavaPrograms.Practice");
	 // System.out.println(c3);
		
		
		Class c2=Class.forName("com.mysql.cj.jdbc.Driver");
		 System.out.println(c2);

	}

}
