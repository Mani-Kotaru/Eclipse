package com.javaintro;

public class Test2 {
	int sno = 9;
	String sname = "koi";
	static void method(){
		Test2 m = new Test2();//here static method containing instance data,then where the static method occupy memory whether heap or method area?
		System.out.println(m.sno);
		System.out.println(m.sname);
	}

	public static void main(String[] args) {
		Test2 m = new Test2();
		method();
		System.out.println("welcome to vcube");
	}

}
